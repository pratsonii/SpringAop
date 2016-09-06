package com.pratik.aspect;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pratik.CustomException.CommonException;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	Logger log = Logger.getLogger(this.getClass());
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity handleSQLException(HttpServletRequest request, Exception ex)
	{
		log.info("SQLException Occured:: URL="+request.getRequestURL());
		return new ResponseEntity("database_error", HttpStatus.OK);
	}
	
	@ExceptionHandler(CommonException.class)
	public ResponseEntity handleCommonException(HttpServletRequest request, Exception ex)
	{
		log.info("CommonException Occured:: URL="+request.getRequestURL());
		return new ResponseEntity(ex.getMessage(), HttpStatus.OK);
	}
}
