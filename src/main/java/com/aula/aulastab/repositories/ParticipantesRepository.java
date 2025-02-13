package com.aula.aulastab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aula.aulastab.entities.Participantes;

@Repository
public interface ParticipantesRepository extends JpaRepository<Participantes, Long> {

}
