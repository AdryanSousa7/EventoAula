package com.aula.aulastab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.aulastab.dto.ParticipantesDTO;
import com.aula.aulastab.entities.Participantes;
import com.aula.aulastab.service.ParticipantesService;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipantesService participantesService;

   @PostMapping
    public ResponseEntity<Participantes> salvarParticipantes(@RequestBody ParticipantesDTO participantesDTO) {
        Participantes participantes = new Participantes(
                participantesDTO.getId(),
                participantesDTO.getNome(),
                participantesDTO.getEmail(), null
        );
        participantes = participantesService.salvarParticipantes(participantes);
        return new ResponseEntity<>(participantes, HttpStatus.CREATED);
    }

}
