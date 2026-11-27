package com.muzu.backend.service;

import com.muzu.backend.dto.room.DefaultRoomSizesDto;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    public DefaultRoomSizesDto getDefaultRoomSizes() {
        return new DefaultRoomSizesDto();
    }
}
