package tools.exceptions;

import java.util.MissingResourceException;

public class NoSuchTestUserException extends RuntimeException {
    public NoSuchTestUserException(String msg, MissingResourceException e) {
        super(msg);
    }
}