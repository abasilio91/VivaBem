package br.com.vivabem.modelo;

import br.com.vivabem.StatusFuncionario;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String data_admissao;
    private String data_demisssao;
    private String status = "";
       
    public Funcionario(
            String nome, 
            String cpf, 
            String dt_nascimento,
            String cargo,
            double salario,
            String data_admissao) throws Exception {
                
        super(nome, cpf, dt_nascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.data_admissao = data_admissao;
        this.status = StatusFuncionario.ATIVO.getStatus();
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getData_admissao() {
        return this.data_admissao;
    }

    public String getData_demisssao() {
        return this.data_demisssao;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public void setData_demisssao(String data_demisssao) {
        this.data_demisssao = data_demisssao;
    }
}
