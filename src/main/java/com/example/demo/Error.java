package com.example.demo;

import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.http.HttpStatus;

public class Error {
	
	private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;
	public Error(String message, HttpStatus status, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}    
}
