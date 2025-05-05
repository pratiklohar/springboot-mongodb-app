package com.myapp.springbootmongodbapp.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
public class ApiResponse<T> {

    private final boolean success;
    private final T data;
    private final String errorCode;
    private final T errorMessage;
    private final Instant timestamp;

    // Private constructor to enforce factory method usage
    private ApiResponse(boolean success, T data, String errorCode, T errorMessage) {
        this.success = success;
        this.data = data;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.timestamp = Instant.now();
    }

    // Factory method: success
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, data, null, null);
    }

    // Factory method: error
    public static <T> ApiResponse<T> error(String errorCode, T errorMessage) {
        return new ApiResponse<>(false, null, errorCode, errorMessage);
    }
}
