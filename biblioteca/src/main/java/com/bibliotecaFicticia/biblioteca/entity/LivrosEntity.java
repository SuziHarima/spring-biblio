package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Table(name = "livros")
@Entity
@Data
@NoArgsConstructor
public class LivrosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;
    private Integer anoPublicacao;
}
