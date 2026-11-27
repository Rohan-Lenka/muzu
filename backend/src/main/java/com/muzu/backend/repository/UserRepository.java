package com.muzu.backend.repository;

import com.muzu.backend.entity.Song;
import com.muzu.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = """
            SELECT s.id, s.name, s.yt_url, s.user_id FROM song s JOIN "user" u ON u.id = s.user_id WHERE u.id = :userId
            """, nativeQuery = true
    )
    List<Song> getSavedSongsByUserId(@Param("userId") String userId);

}
