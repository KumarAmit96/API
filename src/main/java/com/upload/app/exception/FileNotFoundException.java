package com.upload.app.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;


	public FileNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}

	public FileNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
