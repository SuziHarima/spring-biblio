package com.bibliotecaFicticia.biblioteca.service;

import com.bibliotecaFicticia.biblioteca.entity.LivroEntity;
import com.bibliotecaFicticia.biblioteca.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroEntity salvarLivro(LivroEntity livro) {
        return livroRepository.save(livro);
    }
}
