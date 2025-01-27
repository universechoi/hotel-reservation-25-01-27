package com.hotelreservation.backend.domain.amenity.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class AmenityException extends DomainException {
    public AmenityException(ErrorCode errorCode) {
        super(errorCode);
    }
}
