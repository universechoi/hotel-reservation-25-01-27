package com.hotelreservation.backend.domain.reservation.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class ReservationException extends DomainException {
    public ReservationException(ErrorCode errorCode) {
        super(errorCode);
    }
}
