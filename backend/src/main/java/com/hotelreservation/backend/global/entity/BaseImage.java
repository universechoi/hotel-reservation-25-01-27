package com.hotelreservation.backend.global.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseImage extends BaseEntity{
    @Column(name = "url", nullable = false)
    private String url;

    @CreatedDate
    @Setter(AccessLevel.PRIVATE)
    private LocalDateTime uploadedAt;
}
