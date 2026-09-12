package br.com.vivabem.modelo;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {

    protected String nome;
    protected String cpf;

    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
}
