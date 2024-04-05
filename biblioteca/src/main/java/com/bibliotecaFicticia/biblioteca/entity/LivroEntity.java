package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "livros")
@Entity
@Data
@NoArgsConstructor
public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;
    private Integer anoPublicacao;
}
