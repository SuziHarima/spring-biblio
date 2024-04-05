package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {
}
