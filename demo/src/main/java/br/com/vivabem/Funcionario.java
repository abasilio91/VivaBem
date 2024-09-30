package br.com.vivabem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.vivabem.Pessoa;
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

    public static void createFuncionario(Funcionario funcionario) {
        
        String sql = "INSERT INTO FUNCIONARIOS (NOME, CPF, CARGO, DT_NASCIMENTO, DT_ADMISSAO, SALARIO, STATUS) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (
            Connection conn = ConexaoDB.connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ) {
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getCpf());
            preparedStatement.setString(3, funcionario.getCargo());
            preparedStatement.setString(4, funcionario.getDt_nascimento());
            preparedStatement.setString(5, funcionario.getData_admissao());
            preparedStatement.setDouble(6, funcionario.getSalario());
            preparedStatement.setString(7, funcionario.getStatus());

            preparedStatement.execute();
            preparedStatement.close();
            
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        
    }

    public static void readFuncionario(int id, ConexaoDB conexaoDB) {

    }

    public static void upadteFuncionario(int id, Funcionario funcionario, ConexaoDB conexaoDB) {

    }

    public static void deleteFuncionario(int id, Funcionario funcionario, ConexaoDB conexaoDB) {
        
    }

}
