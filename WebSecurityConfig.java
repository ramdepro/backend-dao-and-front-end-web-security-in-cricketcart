package com.niit.Cricket_frontend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("somsubhra").password("password@123").roles("USER")
		.and().withUser("admin").password("password").roles("ADMIN");
		
		
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		
		.antMatchers("/Productadmin/**").access("hasRole('ADMIN')")
		.and()
		.formLogin()
		.LoginPage("/Login").and().csrf().disable();
		
	}
	
	
	
	
	

}
