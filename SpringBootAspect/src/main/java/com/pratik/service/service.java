package com.pratik.service;

import org.springframework.stereotype.Service;

import com.pratik.CustomException.CommonException;

@Service
public class service {

	public void test()
	{
		System.out.println("in test");
	}
	
	public void exception() throws CommonException
	{
		throw new CommonException("Love Pratik");
	}
}
