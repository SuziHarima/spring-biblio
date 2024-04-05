package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import com.bibliotecaFicticia.biblioteca.service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;


    @PostMapping
    public ResponseEntity<BibliotecarioEntity> criarBibliotecario(@RequestBody BibliotecarioEntity biblitoecario) {
        return ResponseEntity.ok().build();
    }

}
