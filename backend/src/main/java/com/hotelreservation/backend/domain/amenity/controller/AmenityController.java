package com.hotelreservation.backend.domain.amenity.controller;

import com.hotelreservation.backend.domain.amenity.service.AmenityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/amenities")
@RequiredArgsConstructor
public class AmenityController {
    private final AmenityService amenityService;
}
