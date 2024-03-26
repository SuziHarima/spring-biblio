package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="emprestimos")
@Entity
@Data
@NoArgsConstructor
public class EmprestimosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "livro_id", nullable = false)
    private LivrosEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private Integer membro;

    private Integer dataEmprestimo;
    private Integer dataDevolucao;

}
