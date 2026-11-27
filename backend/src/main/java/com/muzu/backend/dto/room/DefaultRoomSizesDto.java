package com.muzu.backend.dto.room;

import com.muzu.backend.constants.RoomConstants;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class DefaultRoomSizesDto {
    private final int maxRoomSize = RoomConstants.MAX_ROOM_SIZE;
    private final List<Integer> defaultRoomSizes = RoomConstants.DEFAULT_ROOM_SIZES;
}
