package com.hotelreservation.backend.global.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.dto.response.ApiResponse;
import jakarta.validation.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DomainException.class)
    public ResponseEntity<ApiResponse<Void>> handleDomainException(DomainException e) {
        log.error("DomainException occurred: {}", e.getMessage(), e);
        ApiResponse<Void> response = ApiResponse.error(ErrorCode.HOTEL_NOT_FOUND);
        return ResponseEntity.status(ErrorCode.HOTEL_NOT_FOUND.getStatus())
                .body(response);
    }
}