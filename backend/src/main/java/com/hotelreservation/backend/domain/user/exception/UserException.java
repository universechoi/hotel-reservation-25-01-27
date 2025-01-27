package com.hotelreservation.backend.domain.user.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class UserException extends DomainException {
    public UserException(ErrorCode errorCode) {
        super(errorCode);
    }
}
