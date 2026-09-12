package br.com.vivabem.modelo;

import jakarta.persistence.*;

@Entity
public class Funcionario extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String cargo;
        
    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
