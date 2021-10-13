package com.devsuperior.crudclientes.dto;

import java.time.Instant;

import com.devsuperior.crudclientes.entities.Client;

public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant brithDate;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, Instant brithDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.brithDate = brithDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.brithDate = entity.getBrithDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return this.income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBrithDate() {
        return this.brithDate;
    }

    public void setBrithDate(Instant brithDate) {
        this.brithDate = brithDate;
    }

    public Integer getChildren() {
        return this.children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

}
