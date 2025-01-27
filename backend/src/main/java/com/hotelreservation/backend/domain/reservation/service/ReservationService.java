package com.hotelreservation.backend.domain.reservation.service;

import com.hotelreservation.backend.domain.reservation.controller.ReservationController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationController reservationController;
}
