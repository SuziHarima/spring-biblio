package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Transactional
    @Modifying
    @Query
            ("UPDATE EmprestimoEntity emprestimo SET emprestimo.id = :id WHERE emprestimo.dataDevolucao = :dataDevolucao")
    void updateDevolucao(@Param("id") Long id,
                         @Param("dataDevolucao") LocalDate dataDevolucao);
}
