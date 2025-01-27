package com.hotelreservation.backend.domain.userDetail.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class UserDetailException extends DomainException {
    public UserDetailException(ErrorCode errorCode) {
        super(errorCode);
    }
}
