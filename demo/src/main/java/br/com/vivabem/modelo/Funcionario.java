package br.com.vivabem.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Funcionario extends Pessoa {

    @Id
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
}
