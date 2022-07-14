package com.apiFrete.api.cepFrete.services;


import com.apiFrete.api.cepFrete.dto.FreteDTO;
import com.apiFrete.api.cepFrete.entities.Frete;
import com.apiFrete.api.cepFrete.repositories.FreteRepository;
import com.apiFrete.api.cepFrete.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FreteService {

    @Autowired
    private FreteRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<FreteDTO> findAll(Pageable pageable){
        userRepository.findAll();
        Page<Frete> result = repository.findAll(pageable);
        return result.map(x -> new FreteDTO(x));
    }
}
