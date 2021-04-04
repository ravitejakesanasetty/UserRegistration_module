package com.sp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sp.response.ExceptionResponse;
import com.sp.response.Response;

@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

	 //user not found
	@ExceptionHandler(UserNotFound.class)
	public Response<Object> userNotFound(UserNotFound ex){
		Response<Object> response =new Response<>();
		response.setStatus(HttpStatus.NOT_FOUND);
		ExceptionResponse err=new ExceptionResponse(ex.getMessage());
		response.setErrorResponse(err);
		
		return response;
	}
	
	@ExceptionHandler(Exception.class)
	public Response<Object> userNotFound(Exception ex){
		Response<Object> response =new Response<>();
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		ExceptionResponse err=new ExceptionResponse(ex.getMessage());
		response.setErrorResponse(err);
		
		return response;
	}
}
