package br.com.vivabem;

import java.util.Date;
import br.com.vivabem.ConexaoDB;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private Date data_admissao;
    private Date data_demisssao;
    private StatusFuncionario status;
    private ConexaoDB conexaoDB;
    
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
        this.status = status.ATIVO;
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

    public static void createFuncionario(Funcionario funcionario, ConexaoDB conexaoDB) {
        String sql = "INSERT INTO FUNCIONARIOS (NOME, CPF, CARGO, DT_NASCIMENTO, DT_ADMISSAO, SALARIO, STATUS) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = conexaoDB.connect();
        PreparedStatement prepareStatement = conn.prepareStatement(sql);

        try {
            prepareStatement.setString(1, this.getNome());
            prepareStatement.setString(2, this.getCpf());
            prepareStatement.setString(3, this.getCargo());
            prepareStatement.setString(4, this.getDt_nascimento());
            prepareStatement.setDate(5, this.getData_admissao());
            prepareStatement.setInt(6, this.getSalario());
            prepareStatement.setString(7, this.status.getStatus());
        } catch (SQLException e) {
            throw new RunTimeException(e.getMessage());
        }
        
    }

    public static void readFuncionario(int id, ConexaoDB conexaoDB) {

    }

    public static void upadteFuncionario(int id, Funcionario funcionario, ConexaoDB conexaoDB) {

    }

    public static void deleteFuncionario(int id, Funcionario funcionario, ConexaoDB conexaoDB) {
        
    }

}
