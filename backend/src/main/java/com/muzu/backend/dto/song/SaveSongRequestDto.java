package com.muzu.backend.dto.song;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveSongRequestDto {

    @NotBlank(message = "Name of the song can not be empty")
    private String name;

    @NotBlank(message = "Youtube Url of the song can not be empty")
    private String ytUrl;

}
