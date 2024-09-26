package vivabem.demo.src.main.java.br.com.vivabem;

import java.util.Date;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private Date data_admissao;
    private Date data_demisssao;
    
    public Funcionario(
            String nome, 
            String cpf, 
            String dt_nascimento,
            String cargo,
            double salario,
            Date data_admissao
            ) throws Exception {
                
        super(nome, cpf, dt_nascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public Date getData_admissao() {
        return this.data_admissao;
    }

    public Date getData_demisssao() {
        return this.data_demisssao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public void setData_demisssao(Date data_demisssao) {
        this.data_demisssao = data_demisssao;
    }
}
