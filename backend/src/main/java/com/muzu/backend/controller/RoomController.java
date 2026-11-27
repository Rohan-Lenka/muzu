package com.muzu.backend.controller;

import com.muzu.backend.dto.room.DefaultRoomSizesDto;
import com.muzu.backend.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/default-sizes")
    public ResponseEntity<DefaultRoomSizesDto> getDefaultRoomSizes() {
        return ResponseEntity.ok(roomService.getDefaultRoomSizes());
    }
}
