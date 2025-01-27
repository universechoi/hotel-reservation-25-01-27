package com.hotelreservation.backend.domain.hotel.hotel.entity;

import com.hotelreservation.backend.global.entity.BaseTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hotel extends BaseTime {
}
