package com.example.demo.domain;

public class pessoa {
    private final long id;
    private final String nome;

    public pessoa(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getnome() {
        return nome;
    }

}
