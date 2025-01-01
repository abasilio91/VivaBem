package br.com.vivabem.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Morador extends Pessoa {

    @Id
    public Integer id;
    public String apartamento;

    public Morador(String nome, String cpf, String apartamento) {
        super(nome, cpf);
        this.apartamento = apartamento;
    }

    public String getApartamento() {
        return this.apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}
