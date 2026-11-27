package com.muzu.backend.dto.song;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavedSongDto {
    private String id;
    private String name;
    private String ytUrl;
}
