package br.com.vivabem.modelo;

public class Morador extends Pessoa {

    public Integer id;
    public Integer apartamento;

    public Morador(Integer id, String nome, String cpf, Integer apartamento) {
        super(nome, cpf);
        this.id = id;
        this.apartamento = apartamento;
    }

    public Integer getApartamento() {
        return this.apartamento;
    }

    public void setApartamento(Integer apartamento) {
        this.apartamento = apartamento;
    }

    public Integer getId() {
        return this.id;
    }
}
