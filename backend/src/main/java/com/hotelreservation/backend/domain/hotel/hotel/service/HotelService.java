package com.hotelreservation.backend.domain.hotel.hotel.service;

import com.hotelreservation.backend.domain.hotel.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository hotelRepository;
}
