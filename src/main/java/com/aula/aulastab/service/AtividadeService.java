package com.aula.aulastab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.aulastab.entities.Atividade;
import com.aula.aulastab.repositories.AtividadeRepository;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public Atividade salvarAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public List<Atividade> listarAtividades() {
        return atividadeRepository.findAll();
    }

    public Atividade buscarAtividadePorId(Long id) {
        return atividadeRepository.findById(id).orElse(null);
    }

    public void deletarAtividade(Long id) {
        atividadeRepository.deleteById(id);
    }
}
