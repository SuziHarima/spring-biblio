package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import com.bibliotecaFicticia.biblioteca.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;


    @PostMapping
    public ResponseEntity<EmprestimoEntity> criarEmprestimo(@RequestBody EmprestimoEntity emprestimo) {
        return ResponseEntity.ok().body(emprestimoService.salvar(emprestimo));
    }

    @GetMapping
    public ResponseEntity<List<EmprestimoEntity>> buscarTodos(){
        return ResponseEntity.ok().body(emprestimoService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaPorId(@PathVariable Long id) {
        emprestimoService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

}
