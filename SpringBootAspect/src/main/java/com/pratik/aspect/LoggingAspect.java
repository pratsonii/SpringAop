package com.pratik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect{

	@Pointcut("execution(* com..*service.*(..))")
	private void selectAll(){}
//	@Pointcut("execution(* com..*controller.*(..))")
	@Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
	private void selectController(){}

	@Before("selectAll()")
	public void beforeAdvice(JoinPoint j){
		System.out.println("--- Start method: "+ j.getSignature().getName() );
	}

	@Before("selectController()")
	public void beforeControllerAdvice(JoinPoint j){
		System.out.println("--- Start method: "+ j.getSignature().getName() );
	}
}
