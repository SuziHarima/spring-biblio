package com.bibliotecaFicticia.biblioteca.repository;


import com.bibliotecaFicticia.biblioteca.entity.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Transactional
    @Modifying
    @Query
            ("UPDATE LivroEntity livro SET livro.nome = :nome WHERE nome.autor = :autor")
    void updateAutor (@Param("nome") String nome,
                     @Param("autor") String autor);
}
