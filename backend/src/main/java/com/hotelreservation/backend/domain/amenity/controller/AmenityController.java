package com.hotelreservation.backend.domain.amenity.controller;

import com.hotelreservation.backend.domain.amenity.dto.request.AmenityRequest;
import com.hotelreservation.backend.domain.amenity.dto.response.AmenityResponse;
import com.hotelreservation.backend.domain.amenity.entity.Amenity;
import com.hotelreservation.backend.domain.amenity.exception.AmenityException;
import com.hotelreservation.backend.domain.amenity.service.AmenityService;
import com.hotelreservation.backend.global.dto.response.ApiResponse;
import com.hotelreservation.backend.global.exception.ErrorCode;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/amenities")
@RequiredArgsConstructor
public class AmenityController {
    private final AmenityService amenityService;

    @PostMapping
    public ApiResponse<AmenityResponse> add(@RequestBody @Valid AmenityRequest.Details details,
                                            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AmenityException(ErrorCode.INVALID_INPUT_VALUE);
        }
        Amenity amenity = amenityService.add(details);

        return ApiResponse.success(
                "201",
                "'항목이 추가되었습니다.",
                new AmenityResponse(amenity)
        );
    }
}
