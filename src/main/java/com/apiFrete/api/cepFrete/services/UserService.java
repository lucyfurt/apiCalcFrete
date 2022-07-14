package com.apiFrete.api.cepFrete.services;


import com.apiFrete.api.cepFrete.dto.UserDTO;
import com.apiFrete.api.cepFrete.entities.User;
import com.apiFrete.api.cepFrete.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll(){
        List<User> result = repository.findAll();
        return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    }

}
