package br.com.vivabem.modelo.morador;

import br.com.vivabem.modelo.Pessoa;

public class Morador extends Pessoa {
    private String apartamento;

    public Morador(String nome, String cpf, String dt_nascimento, String apartamento) throws Exception {
        super(nome, cpf, dt_nascimento);
        this.apartamento = apartamento;
    }

    public String getApartamento() {
        return this.apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}
