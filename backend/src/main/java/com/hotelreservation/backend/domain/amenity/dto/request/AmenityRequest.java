package com.hotelreservation.backend.domain.amenity.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AmenityRequest {
    public record Details(
            @NotBlank(message = "추가할 어메니티를 입력해주세요.")
            @Size(max = 255, message = "255자 이하로 입력해주세요.")
            String description
    ) {}
}
