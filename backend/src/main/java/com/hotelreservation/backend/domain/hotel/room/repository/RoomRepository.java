package com.hotelreservation.backend.domain.hotel.room.repository;

import com.hotelreservation.backend.domain.hotel.room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
