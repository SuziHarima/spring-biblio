package com.bibliotecaFicticia.biblioteca.service;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import com.bibliotecaFicticia.biblioteca.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoEntity salvarEmprestimo(EmprestimoEntity emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }
}
