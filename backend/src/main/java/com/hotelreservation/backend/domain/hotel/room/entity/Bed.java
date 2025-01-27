package com.hotelreservation.backend.domain.hotel.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Bed {
    @Enumerated(EnumType.STRING)
    @NotNull(message = "침대 유형은 필수 항목입니다.")
    @Column(name = "bed_type", nullable = false)
    private BedType bedType;

    @NotNull(message = "침대 개수는 필수 항목입니다.")
    @Min(value = 0, message = "침대 개수는 0 이상이어야 합니다.")
    @Column(name = "bed_count", nullable = false)
    private int count;
}
