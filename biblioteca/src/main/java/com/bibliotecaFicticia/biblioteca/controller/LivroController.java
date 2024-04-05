package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.LivroEntity;
import com.bibliotecaFicticia.biblioteca.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;


    @PostMapping
    public ResponseEntity<LivroEntity> criarLivro(@RequestBody LivroEntity livro) {
        return ResponseEntity.ok().build();
    }

}
