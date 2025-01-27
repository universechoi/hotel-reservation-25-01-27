package com.hotelreservation.backend.domain.review.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class ReviewException extends DomainException {
    public ReviewException(ErrorCode errorCode) {
        super(errorCode);
    }
}
