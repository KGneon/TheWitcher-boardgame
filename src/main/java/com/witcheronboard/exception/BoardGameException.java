package com.witcheronboard.exception;

public class BoardGameException extends RuntimeException {
    static final long serialVersionUID = 1L;
    public BoardGameException(String message) {
        super(message);
    }
}
