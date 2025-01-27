package com.hotelreservation.backend.domain.payment.entity;

import com.hotelreservation.backend.global.entity.BaseTime;
import jakarta.persistence.Entity;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends BaseTime {

}
