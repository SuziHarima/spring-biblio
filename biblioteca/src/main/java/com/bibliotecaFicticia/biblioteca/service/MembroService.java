package com.bibliotecaFicticia.biblioteca.service;

import com.bibliotecaFicticia.biblioteca.entity.MembroEntity;
import com.bibliotecaFicticia.biblioteca.repository.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroEntity salvar(MembroEntity membro) {
        return membroRepository.save(membro);
    }

    public List<MembroEntity> buscarTodos() {
        return membroRepository.findAll();
    }
}
