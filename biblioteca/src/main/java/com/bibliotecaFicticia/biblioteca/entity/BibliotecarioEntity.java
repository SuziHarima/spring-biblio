package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="bibliotecarios")
@Entity
@Data
@NoArgsConstructor
public class BibliotecarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
