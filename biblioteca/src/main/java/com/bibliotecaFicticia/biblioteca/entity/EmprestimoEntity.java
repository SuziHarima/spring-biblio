package com.bibliotecaFicticia.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="emprestimos")
@Entity
@Data
@NoArgsConstructor
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private Integer membro;

    private Integer dataEmprestimo;
    private Integer dataDevolucao;

}
