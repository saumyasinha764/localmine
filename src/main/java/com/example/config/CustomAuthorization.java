package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class CustomAuthorization extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("saumya").password("Welcome@123").roles("USER")
		.and().withUser("admin").password("Password@123").roles("ADMIN");
	}
	
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/getStudList").hasRole("USER")
		.antMatchers("/**").hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
	}

}
