package com.aula.aulastab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.aulastab.dto.AtividadeDTO;
import com.aula.aulastab.entities.Atividade;
import com.aula.aulastab.entities.Categoria;
import com.aula.aulastab.service.AtividadeService;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping
    public ResponseEntity<Atividade> salvarAtividade(@RequestBody AtividadeDTO atividadeDTO) {

        Categoria categoria = new Categoria(atividadeDTO.getCategoriaId(), "");
        Atividade atividade = new Atividade(
            atividadeDTO.getId(),
            atividadeDTO.getNome(),
            atividadeDTO.getDescricao(),
            atividadeDTO.getPreco(),
            categoria, 
            null,      
            null 
        );
        atividade = atividadeService.salvarAtividade(atividade);
        return new ResponseEntity<>(atividade, HttpStatus.CREATED);
    }

}
