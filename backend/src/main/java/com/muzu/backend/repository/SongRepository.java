package com.muzu.backend.repository;

import com.muzu.backend.entity.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, String> {

    Page<Song> findAllByUser_Id(String userId, Pageable pageable);

}
