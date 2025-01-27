package com.hotelreservation.backend.domain.userDetail.entity;

import com.hotelreservation.backend.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class UserDetail extends BaseEntity {
}
