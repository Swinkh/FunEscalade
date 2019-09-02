package com.jonathanweb.funescalade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathanweb.funescalade.model.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
