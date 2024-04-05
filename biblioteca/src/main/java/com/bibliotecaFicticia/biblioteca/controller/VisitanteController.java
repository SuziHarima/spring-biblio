package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import com.bibliotecaFicticia.biblioteca.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;


    @PostMapping
    public ResponseEntity<VisitanteEntity> criarVisitante(@RequestBody VisitanteEntity visitante) {
        return ResponseEntity.ok().body(visitanteService.salvar(visitante));
    }

    @GetMapping
    public ResponseEntity<List<VisitanteEntity>> buscarTodos(){
        return ResponseEntity.ok().body(visitanteService.buscarTodos());
    }

}
