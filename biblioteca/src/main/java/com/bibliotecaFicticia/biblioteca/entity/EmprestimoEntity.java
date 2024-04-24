package com.bibliotecaFicticia.biblioteca.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="emprestimo")
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

    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDate dataEmprestimo;

    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDate dataDevolucao;

}
