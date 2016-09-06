package com.pratik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect implements ThrowsAdvice{

	@Pointcut("execution(* com..*service.*(..))")
	private void selectAll(){}

	@Before("selectAll()")
	public void beforeAdvice(JoinPoint j){
		System.out.println("--- Start method: "+ j.getSignature().getName() );
	}
}
