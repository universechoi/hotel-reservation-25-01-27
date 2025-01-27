package com.hotelreservation.backend.domain.hotel.room.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class RoomException extends DomainException {
    public RoomException(ErrorCode errorCode) {
        super(errorCode);
    }
}
