package com.pratik.service;

import org.springframework.stereotype.Service;

@Service
public class service {

	public void test()
	{
		System.out.println("in test");
	}
	
	public void exception()
	{
		throw new NullPointerException();
	}
}
