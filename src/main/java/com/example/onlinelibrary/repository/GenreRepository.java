package com.example.onlinelibrary.repository;

import com.example.onlinelibrary.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
