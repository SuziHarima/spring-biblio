package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
}
