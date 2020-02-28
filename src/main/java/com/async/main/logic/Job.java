package com.async.main.logic;

import java.io.Serializable;


public class Job implements Serializable {

	private static final long serialVersionUID = 2L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
