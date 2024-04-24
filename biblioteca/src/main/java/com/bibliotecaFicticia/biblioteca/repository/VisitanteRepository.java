package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Transactional
    @Modifying
    @Query
            ("UPDATE VisitanteEntity visitante SET visitante.nome = :nome WHERE nome.telefone = :telefone")
    void updateTelefone (@Param("nome") String nome,
                         @Param("telefone") String telefone);
}
