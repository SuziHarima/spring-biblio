package com.bibliotecaFicticia.biblioteca.controller;


import com.bibliotecaFicticia.biblioteca.entity.MembroEntity;
import com.bibliotecaFicticia.biblioteca.service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;


    @PostMapping
    public ResponseEntity<MembroEntity> criarMembro(@RequestBody MembroEntity membro) {
        return ResponseEntity.ok().build();
    }

}
