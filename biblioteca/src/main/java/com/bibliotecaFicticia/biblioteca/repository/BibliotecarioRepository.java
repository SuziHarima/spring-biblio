package com.bibliotecaFicticia.biblioteca.repository;

import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
    @Modifying
    @Query
            ("UPDATE BibliotecarioEntity bibliotecario SET bibliotecario.nome = :nome WHERE bibliotecario.email = :email")
    void updateEmail(@Param("nome") String nome,
                     @Param("email") String email);

}
