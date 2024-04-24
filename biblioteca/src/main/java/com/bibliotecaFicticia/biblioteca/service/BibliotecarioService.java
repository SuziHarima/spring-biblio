package com.bibliotecaFicticia.biblioteca.service;


import com.bibliotecaFicticia.biblioteca.entity.BibliotecarioEntity;
import com.bibliotecaFicticia.biblioteca.repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioEntity salvar(BibliotecarioEntity bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    public List<BibliotecarioEntity> buscarTodos() {
        return bibliotecarioRepository.findAll();
    }

    public void deletarPorId(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

    public void atualizaEmail(String nome, String email){
        bibliotecarioRepository.updateEmail(nome, email);
    }

}
