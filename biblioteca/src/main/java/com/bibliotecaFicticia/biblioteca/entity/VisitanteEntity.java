package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "visitantes")
@Entity
@Data
@NoArgsConstructor
public class VisitanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;


    private String telefone;
}
