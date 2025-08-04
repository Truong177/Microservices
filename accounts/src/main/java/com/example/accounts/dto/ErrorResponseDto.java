package com.example.accounts.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponseDto {
    private String errorCode;
    private String status;
    private String message;
    private LocalDateTime timestamp;

    public ErrorResponseDto() {
    }

    public ErrorResponseDto(String errorCode, HttpStatus status, String message, LocalDateTime timestamp) {
        this.errorCode = errorCode;
        this.status = status.name();
        this.message = message;
        this.timestamp = timestamp;
    }
}
