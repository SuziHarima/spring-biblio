package com.bibliotecaFicticia.biblioteca.service;


import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import com.bibliotecaFicticia.biblioteca.repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioEntity salvar(BibliotecarioEntity bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

}
