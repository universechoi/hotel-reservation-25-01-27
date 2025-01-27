package com.hotelreservation.backend.domain.amenity.repository;

import com.hotelreservation.backend.domain.amenity.entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Long> {
}
