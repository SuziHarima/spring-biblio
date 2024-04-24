package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.MembroEntity;
import com.bibliotecaFicticia.biblioteca.service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;


    @PostMapping
    public ResponseEntity<MembroEntity> criarMembro(@RequestBody MembroEntity membro) {
        return ResponseEntity.ok().body(membroService.salvar(membro));
    }

    @GetMapping
    public ResponseEntity<List<MembroEntity>> buscarTodos(){
        return ResponseEntity.ok().body(membroService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaPorId(@PathVariable Long id) {
        membroService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

}
