package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import com.bibliotecaFicticia.biblioteca.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;


    @PostMapping
    public ResponseEntity<VisitanteEntity> criarVisitante(@RequestBody VisitanteEntity visitante) {
        return ResponseEntity.ok().build();
    }

}
