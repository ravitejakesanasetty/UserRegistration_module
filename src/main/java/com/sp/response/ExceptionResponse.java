package com.sp.response;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExceptionResponse {
  private String date;
  private String errorMessage;
  
  
public ExceptionResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ExceptionResponse( String errorMessage) {
	super();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	this.date = formatter.format(new Date());
	this.errorMessage = errorMessage;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
  
  
}
