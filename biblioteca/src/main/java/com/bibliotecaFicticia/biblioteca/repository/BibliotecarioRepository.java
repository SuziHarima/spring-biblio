package com.bibliotecaFicticia.biblioteca.repository;

import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
