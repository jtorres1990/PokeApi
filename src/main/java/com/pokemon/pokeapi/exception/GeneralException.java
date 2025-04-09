package com.pokemon.pokeapi.exception;

public class GeneralException extends RuntimeException {
    public GeneralException() {
        super();
    }
    public GeneralException(String message) {
        super(message);
    }
    public GeneralException(Throwable cause) {
        super(cause);
    }
    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }
}
