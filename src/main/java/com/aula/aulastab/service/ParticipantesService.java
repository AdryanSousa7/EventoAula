package com.aula.aulastab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.aulastab.entities.Participantes;
import com.aula.aulastab.repositories.ParticipantesRepository;

@Service
public class ParticipantesService {

    @Autowired
    private ParticipantesRepository participantesRepository;

    public Participantes salvarParticipantes(Participantes participantes) {
        return participantesRepository.save(participantes);
    }

    public List<Participantes> listarParticipantes() {
        return participantesRepository.findAll();
    }

    public Participantes buscarParticipantePorId(Long id) {
        return participantesRepository.findById(id).orElse(null);
    }

    public void deletarParticipantes(Long id) {
        participantesRepository.deleteById(id);
    }
}
