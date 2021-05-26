package com.tmb.exceptions;

public class PropertyFileNotFoundException extends RuntimeException{

    public PropertyFileNotFoundException(String message){
        super(message);
    }

    public PropertyFileNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

}
