package com.hotelreservation.backend.domain.amenity.service;

import com.hotelreservation.backend.domain.amenity.repository.AmenityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AmenityService {
    private final AmenityRepository amenityRepository;
}
