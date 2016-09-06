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
	public ResponseEntity handleNullPointerException(HttpServletRequest request, Exception ex)
	{
		log.debug("NullPointerException Occured:: URL="+request.getRequestURL());
		return new ResponseEntity("NullPointerException", HttpStatus.OK);
	}
	
	@ExceptionHandler(CommonException.class)
	public ResponseEntity handleCommonException(HttpServletRequest request, Exception ex)
	{
		log.debug("CommonException Occured:: URL="+request.getRequestURL());
		return new ResponseEntity(ex.getMessage(), HttpStatus.OK);
	}
}
