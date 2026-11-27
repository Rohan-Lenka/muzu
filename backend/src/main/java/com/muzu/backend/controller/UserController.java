package com.muzu.backend.controller;

import com.muzu.backend.dto.song.SaveSongRequestDto;
import com.muzu.backend.dto.song.SavedSongDto;
import com.muzu.backend.dto.user.UserProfileDto;
import com.muzu.backend.repository.UserRepository;
import com.muzu.backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // Post endpoint for User skipped, will add during auth phase.

    @GetMapping("/profile/{userId}")
    public ResponseEntity<UserProfileDto> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PostMapping("/save/song/{userId}")
    public ResponseEntity<SavedSongDto> saveSongToUser(
            @PathVariable String userId,
            @RequestBody @Valid SaveSongRequestDto saveSongRequestDto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.saveSongToUser(userId, saveSongRequestDto));
    }

    @GetMapping("/saved/songs/{userId}")
    public ResponseEntity<List<SavedSongDto>> getSavedSongs(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getSavedSongsByUserId(userId));
    }

    // implementation after auth
//    @PatchMapping("/saved/song/{songId}")
//    public ResponseEntity<SavedSongDto> renameUserSavedSong(
//            @PathVariable String songId,
//            @RequestParam(name = "name") String newName
//    ) {
//        return ResponseEntity.ok(userService.renameUserSavedSong(songId, newName));
//    }
//
//    @DeleteMapping("/saved/song/{songId}")
//    public ResponseEntity<Void> unsaveUserSavedSong(@PathVariable String songId) {
//        userService.unsaveUserSavedSong(songId);
//        return ResponseEntity.noContent().build();
//    }

}
