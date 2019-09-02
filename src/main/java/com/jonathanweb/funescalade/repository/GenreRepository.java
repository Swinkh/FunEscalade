package com.jonathanweb.funescalade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathanweb.funescalade.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	public Genre findByCode(String code);
}
