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

    @GetMapping
    public ApiResponse<List<AmenityResponse>> getAll() {

        List<AmenityResponse> amenityList = amenityService.findAll()
                .stream()
                .map(AmenityResponse::new).toList();

        return ApiResponse.success(
                "200",
                "모든 항목이 조회되었습니다.",
                amenityList
        );
    }

    @GetMapping("/{id}")
    public ApiResponse<AmenityResponse> getById(@PathVariable("id") Long id) {

        Amenity amenity = amenityService.findById(id);

        return ApiResponse.success(
                "200",
                "항목이 조회되었습니다.",
                new AmenityResponse(amenity)
        );
    }

    @PutMapping("/{id}")
    public ApiResponse<AmenityResponse> modify(@PathVariable("id") Long id,
                                               @RequestBody AmenityRequest.Details details,
                                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AmenityException(ErrorCode.INVALID_INPUT_VALUE);
        }
        Amenity amenity = amenityService.findById(id);
        amenityService.modify(amenity, details);

        amenityService.flush();

        return ApiResponse.success(
                "200",
                "항목이 수정되었습니다.",
                new AmenityResponse(amenity)
        );
    }
}
