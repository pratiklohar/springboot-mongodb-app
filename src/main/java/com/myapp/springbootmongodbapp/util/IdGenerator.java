package com.myapp.springbootmongodbapp.util;

import java.util.Random;
import java.util.function.Function;

public class IdGenerator {

    // Generic method to generate an ID
    public static <T> Integer generateId(String name, Function<Integer, Boolean> existsByIdFunction) {
        var id = name.length() * new Random().nextInt(1, 10);
        if (existsByIdFunction.apply(id)) {
            return generateId(name, existsByIdFunction); // Retry if ID already exists
        }
        return id;
    }
}
