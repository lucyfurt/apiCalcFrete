package com.apiFrete.api.cepFrete.controllers;


import com.apiFrete.api.cepFrete.dto.FreteDTO;
import com.apiFrete.api.cepFrete.entities.Frete;
import com.apiFrete.api.cepFrete.services.FreteService;
import com.apiFrete.api.cepFrete.services.FreteServiceViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(value = "/fretes")
public class FreteController {

    @Autowired
    private FreteServiceViaCep service;

    @Autowired
    private FreteService freteService;

    @GetMapping("/{cep}")
    public ResponseEntity<Frete> getCep(@PathVariable String cep){
        Frete frete = service.buscaCep(cep);
        return frete != null ? ResponseEntity.ok().body(frete) : ResponseEntity.notFound().build();
    }
    @GetMapping
    public ResponseEntity<Page<FreteDTO>> findAll(Pageable pageable){
        Page<FreteDTO> list = freteService.findAll(pageable);
        return ResponseEntity.ok(list);
    }


}
