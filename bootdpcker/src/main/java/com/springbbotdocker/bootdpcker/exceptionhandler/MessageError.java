package com.springbbotdocker.bootdpcker.exceptionhandler;

import java.util.Date;

public class MessageError {

	private Date timestamp;
	
	private String error;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
