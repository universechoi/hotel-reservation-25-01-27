package com.hotelreservation.backend.domain.reservation.entity;

import com.hotelreservation.backend.global.entity.BaseTime;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation extends BaseTime {
}
