package com.niit.Cricket_frontend.controller;

import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserRegistrationController {
	
	
	UserDAO userDAO;
	
	

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model model)
	{
		model.addAttribute("user",new user());
		
		return "regiter";
	}
	
	
	@RequestMapping(value= "/user/add", method = RequestMethod.POST)
	public String addPerson(@Valid @ModelAttribute("user") User user,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return "Register";
			
		}else{
			userDAO.addUser(user;)
			return "redirect:/";
			
			
		}

}
