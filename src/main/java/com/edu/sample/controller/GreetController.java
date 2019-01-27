package com.edu.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edu.sample.model.Person;
import com.edu.sample.service.PersonService;

@Controller
public class GreetController {
	@Autowired
	private PersonService service;
	
    @RequestMapping(path= "/greet/{name}",method=RequestMethod.GET)    
    public ModelAndView greet(@PathVariable String name){
    	ModelAndView modelAndView = new ModelAndView("greet");
        String greet =" Hello !!!" + name + " How are You?";
        modelAndView.addObject("msj", greet);
        Person person = new Person();
        person.setFirstName("Denys");
        service.add(person);
        return modelAndView;
    }
}
