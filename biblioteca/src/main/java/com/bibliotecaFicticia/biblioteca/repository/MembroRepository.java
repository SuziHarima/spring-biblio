package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
}
