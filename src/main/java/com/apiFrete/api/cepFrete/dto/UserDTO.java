package com.apiFrete.api.cepFrete.dto;

import com.apiFrete.api.cepFrete.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nomeRemetente;

    public UserDTO(){

    }

    public UserDTO(Long id, String nomeRemetente) {
        this.id = id;
        this.nomeRemetente = nomeRemetente;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        nomeRemetente = entity.getNomeRemetente();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }
}
