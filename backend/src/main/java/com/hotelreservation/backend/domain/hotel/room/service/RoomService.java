package com.hotelreservation.backend.domain.hotel.room.service;

import com.hotelreservation.backend.domain.hotel.room.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
}
