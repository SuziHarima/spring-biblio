package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import com.bibliotecaFicticia.biblioteca.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;


    @PostMapping
    public ResponseEntity<EmprestimoEntity> criarEmprestimo(@RequestBody EmprestimoEntity emprestimo) {
        return ResponseEntity.ok().build();
    }

}
