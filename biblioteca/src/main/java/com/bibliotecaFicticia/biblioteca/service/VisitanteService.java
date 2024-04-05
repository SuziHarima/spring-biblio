package com.bibliotecaFicticia.biblioteca.service;

import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import com.bibliotecaFicticia.biblioteca.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteEntity salvarVisitante(VisitanteEntity visitante) {
        return visitanteRepository.save(visitante);
    }
}
