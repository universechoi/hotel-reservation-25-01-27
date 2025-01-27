package com.hotelreservation.backend.domain.payment.exception;

import com.hotelreservation.backend.domain.exception.DomainException;
import com.hotelreservation.backend.global.exception.ErrorCode;

public class PaymentException extends DomainException {
    public PaymentException(ErrorCode errorCode) {
        super(errorCode);
    }
}
