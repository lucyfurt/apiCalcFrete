package com.apiFrete.api.cepFrete.dto;

import com.apiFrete.api.cepFrete.entities.Frete;

import java.time.LocalDate;

public class FreteDTO {

    private Long id;

    private String cep;
    private String uf;
    private String ddd;
    private Double peso;

    private String cepDestino;
    private Double vlTotalFrete;
    private LocalDate dataPrevistaEntrega;
    private LocalDate dataConsulta;

    private String nomeDestinatario;

    private UserDTO user;

    public FreteDTO(){}

    public FreteDTO(Long id, String cep, String uf, String ddd, Double peso, String cepDestino, Double vlTotalFrete, LocalDate dataPrevistaEntrega, LocalDate dataConsulta, String nomeDestinatario, UserDTO user) {
        this.id = id;
        this.cep = cep;
        this.uf = uf;
        this.ddd = ddd;
        this.peso = peso;
        this.cepDestino = cepDestino;
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.dataConsulta = dataConsulta;
        this.nomeDestinatario = nomeDestinatario;
        this.user = user;
    }

    public FreteDTO(Frete entity) {
        id = entity.getId();
        cep = entity.getCep();
        uf = entity.getCep();
        ddd = entity.getDdd();
        peso = entity.getPeso();
        cepDestino = entity.getCepDestino();
        vlTotalFrete = entity.getVlTotalFrete();
        dataPrevistaEntrega = entity.getDataPrevistaEntrega();
        dataConsulta = entity.getDataConsulta();
        nomeDestinatario = entity.getNomeDestinatario();
        user = new UserDTO(entity.getUser());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public Double getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(Double vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
