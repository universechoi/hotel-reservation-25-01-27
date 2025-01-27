package com.hotelreservation.backend.domain.hotel.room.controller;

import com.hotelreservation.backend.domain.hotel.room.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels/{hotelId}/rooms")
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;
}
