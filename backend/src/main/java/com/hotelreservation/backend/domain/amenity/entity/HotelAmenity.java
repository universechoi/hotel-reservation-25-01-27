package com.hotelreservation.backend.domain.amenity.entity;

import com.hotelreservation.backend.global.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(
        name = "hotel_amenity",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_hotel_amenity", columnNames = {"hotel_id", "amenity_id"})
        }
)
public class HotelAmenity extends BaseEntity {
    @NotNull(message = "호텔 정보는 필수입니다.")
    @Column(name = "hotel_id", nullable = false)
    private Long hotelId;

    @NotNull(message = "편의시설 정보는 필수입니다.")
    @Column(name = "amenity_id", nullable = false)
    private Long amenityId;
}
