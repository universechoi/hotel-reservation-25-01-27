package com.hotelreservation.backend.domain.amenity.service;

import com.hotelreservation.backend.domain.amenity.dto.request.AmenityRequest;
import com.hotelreservation.backend.domain.amenity.entity.Amenity;
import com.hotelreservation.backend.domain.amenity.repository.AmenityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AmenityService {
    private final AmenityRepository amenityRepository;

    @Transactional
    public Amenity add(AmenityRequest.Details details) {
        Amenity amenity = Amenity
                .builder()
                .description(details.description())
                .build();

        return amenityRepository.save(amenity);
    }
}
