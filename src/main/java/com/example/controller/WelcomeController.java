package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcomeMsg(){
		return "welcome";
	}
	
	@GetMapping("/getStudList")
	public List<Student> retrieveStudentList(){
		return welcomeService.retrieveStudList();
	}
	
	@RequestMapping(value="/createStud",method = RequestMethod.POST)
	public String createStud(@RequestBody Student stud){
		
		if(welcomeService.addStudent(stud))
			return welcomeService.successMsg();
		else
			return welcomeService.errorMsg();
		
	}
	
	@RequestMapping("/welcomemsg")
	public String welcomeMsg(Map<String,Object> model){
		model.put("message", "First SpringBoot Jsp");
		return "welcome";
	}
	

}
