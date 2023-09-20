package com.example.springformexample.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springformexample.models.User;

@Controller
public class Controller_e {
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	    public String viewRegistration(Map<String, Object> model) {
		 System.out.println("hii");
	        User userForm = new User();    
	        model.put("userForm", userForm);
	         
	        List<String> professionList = new ArrayList<>();
	        professionList.add("Developer");
	        professionList.add("Designer");
	        professionList.add("IT Manager");
	        model.put("professionList", professionList);
	         
	        return "registration";
	    }
	     
	    @RequestMapping(value="/register" ,method = RequestMethod.POST)
	    public String processRegistration(@Valid @ModelAttribute("userForm") User user,BindingResult bindingResult,
	            Map<String, Object> model) {
	         
	        // implement your own registration logic here...
	         
	        // for testing purpose:
	        System.out.println("username: " + user.getName());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail());
	        System.out.println("birth date: " + user.getBirthday());
	        System.out.println("profession: " + user.getProfession());
	         
	 	if (bindingResult.hasErrors()) {  
	 		System.out.println("succ");
			System.out.println(bindingResult.getAllErrors());

	 		return "registration";
	    	} else {
		 		System.out.println("iceuuuu");

	       	 	return "registrationsuccess";
	    	}
	        
	    }
	

}
