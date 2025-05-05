package com.myapp.springbootmongodbapp.util;


import java.util.UUID;

public class IdGenerator {

    // Generic method to generate an ID
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
