package com.example.base;

public class KashidashiException extends RuntimeException {
    public KashidashiException(String messageCode) {
        super(messageCode);
    }
}