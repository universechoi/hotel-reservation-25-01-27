package com.hotelreservation.backend.domain.amenity.entity;

import com.hotelreservation.backend.global.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "amenity")
public class Amenity extends BaseEntity {
    @NotBlank(message = "필수 항목입니다.")
    @Size(max = 255, message = "최대 255자까지 작성 가능합니다.")
    @Column(name = "amenity_description", nullable = false, length = 255)
    private String description;
}
