package com.hotelreservation.backend.domain.user.entity;

import com.hotelreservation.backend.global.entity.BaseTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseTime {
}
