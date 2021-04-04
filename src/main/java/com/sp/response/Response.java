package com.sp.response;

import java.util.Optional;

import org.springframework.http.HttpStatus;

import com.sp.entity.User;

public class Response<T> {
	
	private HttpStatus status;
	private T payLoad;
	private Optional<T> payLoad1;
	private ExceptionResponse errorResponse;
	
	
	
	public Response() {
		super();
	}
	
	public Response(HttpStatus status, T payLoad, Optional<T> payLoad1, ExceptionResponse errorResponse) {
		super();
		this.status = status;
		this.payLoad = payLoad;
		this.payLoad1 = payLoad1;
		this.errorResponse = errorResponse;
	}

	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public T getPayLoad() {
		return payLoad;
	}
	public void setPayLoad(T payLoad) {
		this.payLoad = payLoad;
	}
	public ExceptionResponse getErrorResponse() {
		return errorResponse;
	}
	public void setErrorResponse(ExceptionResponse errorResponse) {
		this.errorResponse = errorResponse;
	}

	public Optional<T> getPayLoad1() {
		return payLoad1;
	}

	public void setPayLoad1(Optional<T> payLoad1) {
		this.payLoad1 = payLoad1;
	}
	
	
	

}
