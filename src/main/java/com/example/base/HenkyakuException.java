package com.example.base;

public class HenkyakuException extends RuntimeException {
    public HenkyakuException(String messageCode) {
        super(messageCode);
    }
}