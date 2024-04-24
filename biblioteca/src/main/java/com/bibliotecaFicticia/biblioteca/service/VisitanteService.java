package com.bibliotecaFicticia.biblioteca.service;

import com.bibliotecaFicticia.biblioteca.entity.VisitanteEntity;
import com.bibliotecaFicticia.biblioteca.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteEntity salvar(VisitanteEntity visitante) {
        return visitanteRepository.save(visitante);
    }

    public List<VisitanteEntity> buscarTodos() {
        return visitanteRepository.findAll();
    }

    public void deletarPorId(Long id) {
        visitanteRepository.deleteById(id);
    }
}
