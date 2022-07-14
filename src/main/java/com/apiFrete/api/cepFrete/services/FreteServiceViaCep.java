package com.apiFrete.api.cepFrete.services;

import com.apiFrete.api.cepFrete.entities.Frete;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="viacep.com.br/ws/", name="viacep")

public interface FreteServiceViaCep {

    @GetMapping("{cep}/json")
    Frete buscaCep(@PathVariable("cep") String cep);
}
