package com.hotelreservation.backend.domain.amenity.entity;

import com.hotelreservation.backend.global.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Amenity extends BaseEntity {
    @Column(name = "amenity_description", nullable = false)
    private String description;
}
