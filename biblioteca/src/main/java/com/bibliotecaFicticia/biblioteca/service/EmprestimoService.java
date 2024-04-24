package com.bibliotecaFicticia.biblioteca.service;


import com.bibliotecaFicticia.biblioteca.entity.EmprestimoEntity;
import com.bibliotecaFicticia.biblioteca.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoEntity salvar(EmprestimoEntity emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public List<EmprestimoEntity> buscarTodos() {
        return emprestimoRepository.findAll();
    }

    public void deletarPorId(Long id) {
        emprestimoRepository.deleteById(id);
    }

    public void atualizaDevolucao(Long id, LocalDate dataDevolucao){
        emprestimoRepository.updateDevolucao(id, dataDevolucao);
    }

}
