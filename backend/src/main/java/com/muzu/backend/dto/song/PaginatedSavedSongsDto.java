package com.muzu.backend.dto.song;

import com.muzu.backend.dto.PaginatedResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedSavedSongsDto extends PaginatedResponse {
    private List<SavedSongDto> songs;

    public PaginatedSavedSongsDto(long total, int pages, List<SavedSongDto> songs) {
        super(total, pages);
        this.songs = songs;
    }

}
