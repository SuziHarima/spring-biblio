package com.bibliotecaFicticia.biblioteca.service;

import com.bibliotecaFicticia.biblioteca.entity.LivroEntity;
import com.bibliotecaFicticia.biblioteca.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroEntity salvar(LivroEntity livro) {
        return livroRepository.save(livro);
    }

    public List<LivroEntity> buscarTodos() {
        return livroRepository.findAll();
    }

    public void deletarPorId(Long id) {
        livroRepository.deleteById(id);
    }
}
