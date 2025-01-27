package com.hotelreservation.backend.domain.hotel.hotel.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class HotelException extends DomainException {
    public HotelException(ErrorCode errorCode) {
        super(errorCode);
    }
}
