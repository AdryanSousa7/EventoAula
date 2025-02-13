package com.aula.aulastab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.aulastab.entities.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Long> {

}
