package com.example.cassandra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = -1658362301755732209L;

	public ResouceNotFoundException(String message)
	{
		super(message);
	}
}
