package com.lti.exception;

import java.util.Date;

public class ErrorProps {
	private String status;
	private String errorMessage;
	private Date currentDate;
	public ErrorProps() {
		
	}
	public ErrorProps(String status, String errorMessage,Date currentDate) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
		this.currentDate=currentDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	

}
