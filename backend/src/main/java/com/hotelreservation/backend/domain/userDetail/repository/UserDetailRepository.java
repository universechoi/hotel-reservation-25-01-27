package com.hotelreservation.backend.domain.userDetail.repository;

import com.hotelreservation.backend.domain.userDetail.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
}
