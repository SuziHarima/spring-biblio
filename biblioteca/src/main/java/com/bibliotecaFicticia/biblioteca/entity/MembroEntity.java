package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "membros")
@Entity
@Data
@NoArgsConstructor
public class MembroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "membro_id")
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String endereco;
    private Integer telefone;
}
