package com.example.ocorrencia.model;

public class Cargo {
    private int id;
    private String nome;
    private boolean registrarOcorrencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isRegistrarOcorrencia() {
        return registrarOcorrencia;
    }

    public void setRegistrarOcorrencia(boolean registrarOcorrencia) {
        this.registrarOcorrencia = registrarOcorrencia;
    }
}
