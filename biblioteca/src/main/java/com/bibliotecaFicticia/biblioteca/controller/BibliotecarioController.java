package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import com.bibliotecaFicticia.biblioteca.service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;


    @PostMapping
    public ResponseEntity<BibliotecarioEntity> criarBibliotecario(@RequestBody BibliotecarioEntity biblitoecario) {
        return ResponseEntity.ok().body(bibliotecarioService.salvar(biblitoecario));
    }

    @GetMapping
    public ResponseEntity<List<BibliotecarioEntity>> buscarTodos(){
        return ResponseEntity.ok().body(bibliotecarioService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaPorId(@PathVariable Long id) {
        bibliotecarioService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

}
