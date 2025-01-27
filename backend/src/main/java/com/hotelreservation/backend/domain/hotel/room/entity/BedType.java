package com.hotelreservation.backend.domain.hotel.room.entity;

public enum BedType {
    SINGLE("싱글 침대"),
    DOUBLE("더블 침대"),
    QUEEN("퀸 침대"),
    KING("킹 침대"),
    TWIN("트윈 침대");

    private final String description;

    // Enum의 생성자는 실제 객체를 생성할 때 사용하는 게 아니라
    // 열거형 상수를 정의할 때 사용되는 형태를 나타냄
    BedType(String description) {
        this.description = description;
    }
}
