package com.upgrad.BookingService.customhandler;

import com.upgrad.BookingService.exceptions.InvalidBookingIdException;
import com.upgrad.BookingService.exceptions.InvalidPaymentModeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomBookingExceptionHandler {

    @ExceptionHandler
    public ResponseEntity InvalidPaymentModeExceptionHandler(InvalidPaymentModeException e){
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("message", "Invalid mode of payment");
        errorResponse.put("statusCode", 400);
        return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity InvalidBookingIdExceptionHandler(InvalidBookingIdException e){
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("message", " Invalid Booking Id ");
        errorResponse.put("statusCode", 400);
        return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
