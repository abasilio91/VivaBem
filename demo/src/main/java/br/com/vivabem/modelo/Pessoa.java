package br.com.vivabem.modelo;

import br.com.vivabem.Validador;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Pessoa(String nome, String cpf, String dt_nascimento) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;

        try {
            if (Validador.validaCPF(cpf)){
                this.cpf = cpf;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDt_nascimento() {
        return this.dt_nascimento;
    }
}
