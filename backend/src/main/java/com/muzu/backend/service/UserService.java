package com.muzu.backend.service;

import com.muzu.backend.dto.song.PaginatedSavedSongsDto;
import com.muzu.backend.dto.song.SaveSongRequestDto;
import com.muzu.backend.dto.song.SavedSongDto;
import com.muzu.backend.dto.user.UserProfileDto;
import com.muzu.backend.entity.Song;
import com.muzu.backend.repository.SongRepository;
import com.muzu.backend.repository.UserRepository;
import com.muzu.backend.service.utils.UserServiceUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final SongRepository songRepository;
    private final ModelMapper modelMapper;
    private final UserServiceUtils userServiceUtils;

    public UserProfileDto getUserProfile(String userId) {
        return modelMapper.map(userServiceUtils.getUserById(userId), UserProfileDto.class);
    }

    public SavedSongDto saveSongToUser(String userId, SaveSongRequestDto saveSongRequestDto) {
        var user = userServiceUtils.getUserById(userId);
        var song = Song
                .builder()
                .name(saveSongRequestDto.getName())
                .ytUrl(saveSongRequestDto.getYtUrl())
                .user(user)
                .build();
        var savedSong = songRepository.save(song);
        return modelMapper.map(savedSong, SavedSongDto.class);
    }

    public PaginatedSavedSongsDto getSavedSongsByUserId(String userId, int page, int pageSize) {
        if (pageSize <= 0) throw new IllegalArgumentException("Page size should be a positive value");
        Page<Song> response = songRepository.findAllByUser_Id(userId, PageRequest.of(page, pageSize));
        List<SavedSongDto> savedSongs = response
                .stream()
                .map(song -> modelMapper.map(song, SavedSongDto.class))
                .toList();
        return new PaginatedSavedSongsDto(response.getTotalElements(), response.getTotalPages(), savedSongs);
    }

}
