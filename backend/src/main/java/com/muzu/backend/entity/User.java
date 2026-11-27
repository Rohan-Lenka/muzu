package com.muzu.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
@Table(name="\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;

    private String username;

    @OneToMany(mappedBy = "user")
    private List<Song> savedSongs;

}
