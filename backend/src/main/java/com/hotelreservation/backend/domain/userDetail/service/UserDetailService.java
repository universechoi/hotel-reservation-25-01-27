package com.hotelreservation.backend.domain.userDetail.service;

import com.hotelreservation.backend.domain.userDetail.repository.UserDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService {
    private final UserDetailRepository userDetailRepository;
}
