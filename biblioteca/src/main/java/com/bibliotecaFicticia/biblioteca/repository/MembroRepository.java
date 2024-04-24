package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.MembroEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Transactional
    @Modifying
    @Query
            ("UPDATE MembroEntity membro SET membro.nome = :nome WHERE membro.endereco = :endereco")
    void updateEndereco (@Param("nome") String nome,
                      @Param("endereco") String endereco);

}
