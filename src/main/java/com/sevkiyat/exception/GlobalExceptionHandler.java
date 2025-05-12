package com.sevkiyat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicatePersonException.class)
    public ResponseEntity<Map<String, Object>> handleDuplicatePerson(DuplicatePersonException ex) {
        Map<String, Object> errorBody = new HashMap<>();
        errorBody.put("code", "DUPLICATE_PERSON");
        errorBody.put("message", ex.getMessage());

        return new ResponseEntity<>(errorBody, HttpStatus.CONFLICT); // 409
    }
}