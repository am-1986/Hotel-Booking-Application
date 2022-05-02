package com.upgrad.BookingService.service;

import com.upgrad.BookingService.dto.PaymentDto;
import com.upgrad.BookingService.entity.BookingInfoEntity;
import com.upgrad.BookingService.exceptions.InvalidBookingIdException;
import com.upgrad.BookingService.exceptions.InvalidPaymentModeException;

public interface BookingService {
    BookingInfoEntity addBooking(BookingInfoEntity bookingInfoEntity);
    BookingInfoEntity addPaymentDetails(int bookingId,PaymentDto paymentDto) throws InvalidBookingIdException, InvalidPaymentModeException;
    BookingInfoEntity getBookingDetails(Integer bookingId);

}
