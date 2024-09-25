package br.com.vivabem;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Pessoa(String nome, String cpf, String dt_nascimento) throws Exception {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;

        if (Validador.validaCPF(cpf)){
            this.cpf = cpf;
        }
    }
}

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private Date data_admissao;
    
    public Funcionario(
            String nome, 
            String cpf, 
            String dt_nascimento, 
            String cargo, 
            double salario, 
            Date data_admissao) throws Exception {
                
        super(nome, cpf, dt_nascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }
    
    public class Morador extends Pessoa {
        private String apartamento;

        public Morador(String nome, String cpf, String dt_nascimento, String apartamento) throws Exception {
            super(nome, cpf, dt_nascimento);
            this.apartamento = apartamento;
        }
        
    }
}
