package com.hotelreservation.backend.domain.userDetail.controller;

import com.hotelreservation.backend.domain.userDetail.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserDetailController {
    private final UserDetailService userDetailService;
}
