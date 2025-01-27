package com.hotelreservation.backend.domain.hotel.room.entity;

import com.hotelreservation.backend.domain.hotel.hotel.entity.Hotel;
import com.hotelreservation.backend.domain.hotel.room.exception.RoomException;
import com.hotelreservation.backend.global.entity.BaseEntity;
import com.hotelreservation.backend.global.exception.ErrorCode;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "room",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_room_per_hotel", columnNames = {"hotel_id", "room_type"})
        }
)
public class Room extends BaseEntity {
    @NotBlank(message = "객실 유형은 필수 항목입니다.")
    @Size(max = 100, message = "객실 유형은 최대 100자까지 가능합니다.")
    @Column(name = "room_type", nullable = false, length = 100)
    private String type;

    @NotNull(message = "기본 가격은 필수 항목입니다.")
    @DecimalMin(value = "0.0", inclusive = true, message = "기본 가격은 0 이상이어야 합니다.")
    @Column(name = "base_price", nullable = false)
    private BigDecimal basePrice;

    @NotNull(message = "기준 인원은 필수 항목입니다.")
    @Min(value = 1, message = "기준 인원은 최소 1명 이상이어야 합니다.")
    @Max(value = 20, message = "기준 인원은 최대 20명까지 가능합니다.")
    @Column(name = "base_guests", nullable = false)
    private Integer baseGuests;

    @NotNull(message = "최대 인원은 필수 항목입니다.")
    @Min(value = 1, message = "최대 인원은 최소 1명 이상이어야 합니다.")
    @Max(value = 50, message = "최대 인원은 최대 50명까지 가능합니다.")
    @Column(name = "max_guests", nullable = false)
    private Integer maxGuests;

    @NotNull(message = "이용가능한 객실 수는 필수 항목입니다.")
    @Min(value = 0, message = "객실 수는 0 이상이어야 합니다.")
    @Column(name = "total_rooms", nullable = false)
    private Integer totalRooms;

    @NotEmpty(message = "침대 정보는 필수 항목입니다.")
    @ElementCollection
    @CollectionTable(name = "room_beds", joinColumns = @JoinColumn(name = "room_id"))
    private List<Bed> beds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    // 항상 적용되어야 하는 규칙은 엔티티 내부에 정의
    // PrePersist: 엔티티가 데이터베이스에 처음 저장되기 전 실행.
    // PreUpdate: 엔티티가 데이터베이스에 업데이트되기 전 실행.
    @PrePersist
    @PreUpdate
    private void validateGuests() {
        if (maxGuests < baseGuests) {
            throw new RoomException(ErrorCode.ROOM_INVALID_INPUT_VALUE);
        }
    }
}

