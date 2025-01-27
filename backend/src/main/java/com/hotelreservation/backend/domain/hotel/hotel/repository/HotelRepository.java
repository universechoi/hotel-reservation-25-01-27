package com.hotelreservation.backend.domain.hotel.hotel.repository;

import com.hotelreservation.backend.domain.hotel.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
