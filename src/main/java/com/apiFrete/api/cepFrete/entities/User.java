package com.apiFrete.api.cepFrete.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeRemetente;

    @OneToMany(mappedBy = "user")
    private List<Frete> fretes = new ArrayList<>();


    public User(){

    }

    public User(Long id, String nomeRemetente) {
        super();
        this.id = id;
        this.nomeRemetente = nomeRemetente;
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

    public List<Frete> getFretes() {
        return fretes;
    }
}
