package com.pratik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratik.CustomException.CommonException;
import com.pratik.service.service;

@RestController
public class AppController {
	
	@Autowired
	service s;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)	
	public void addUser()
	{
		System.out.println("add user");
		s.test();
	}

	@RequestMapping(value="/update", method=RequestMethod.GET)	
	public void updateUser() throws CommonException
	{
		System.out.println("update user");
		
		s.exception();
	}
	
}
