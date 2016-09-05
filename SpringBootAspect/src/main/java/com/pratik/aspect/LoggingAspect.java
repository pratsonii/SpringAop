package com.pratik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* com..*service.*(..))")
	private void selectAll(){}
	
	@Before("selectAll()")
	public void beforeAdvice(JoinPoint j){
		System.out.println("--- Start method: "+ j.getSignature().getName() );
	}
	
	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	   public void AfterThrowingAdvice(NullPointerException ex){
	      System.out.println("There has been an exception: " + ex.toString());   
	   }
}
