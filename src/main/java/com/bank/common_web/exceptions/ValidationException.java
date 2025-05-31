package com.bank.common_web.exceptions;

public class ValidationException extends DomainException {
    
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

}
