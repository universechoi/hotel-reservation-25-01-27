package com.hotelreservation.backend.domain.amenity.service;

import com.hotelreservation.backend.domain.amenity.dto.request.AmenityRequest;
import com.hotelreservation.backend.domain.amenity.entity.Amenity;
import com.hotelreservation.backend.domain.amenity.exception.AmenityException;
import com.hotelreservation.backend.domain.amenity.repository.AmenityRepository;
import com.hotelreservation.backend.global.exception.ErrorCode;
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

    public List<Amenity> findAll() {
        return amenityRepository.findAll();
    }

    public Amenity findById(Long id) {
        return amenityRepository.findById(id)
                .orElseThrow(() ->new AmenityException(ErrorCode.AMENITY_NOT_FOUND));
    }
}
