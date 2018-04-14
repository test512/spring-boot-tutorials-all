package com.devglan.exception;

public class UserNotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String errors;

    public UserNotFoundException(String message) {
        super(message);
        this.errors = message;
    }

    public String getErrors() {
        return errors;
    }
}
