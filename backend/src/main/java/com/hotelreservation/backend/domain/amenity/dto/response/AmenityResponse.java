package com.hotelreservation.backend.domain.amenity.dto.response;

import com.hotelreservation.backend.domain.amenity.entity.Amenity;
import lombok.Getter;

@Getter
public class AmenityResponse {
    private final String description;

    public AmenityResponse(Amenity amenity) {
        this.description = amenity.getDescription();
    }
}
