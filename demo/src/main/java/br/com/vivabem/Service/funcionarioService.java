package br.com.vivabem.Service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.vivabem.modelo.Funcionario;

public class funcionarioService {
    
    private static final Set<Funcionario> listaFuncionarios = new HashSet<Funcionario>();

    private static Scanner teclado = new Scanner(System.in);

    public static void adicionarFuncionario() {
        System.out.println("Informe o nome do funcionário:");
        var nome = teclado.nextLine();

        System.out.println("Informe o CPF do funcionário:");
        var cpf = teclado.next(); teclado.nextLine();

        System.out.println("Informe a data de nascimento do funcionário:");
        var dt_nascimento = teclado.next(); teclado.nextLine();
        
        System.out.println("Informe salario do funcionário:");
        var salario = teclado.nextDouble(); teclado.nextLine();
        
        System.out.println("Informe o cargo do funcionário:");
        var cargo = teclado.nextLine();

        System.out.println("Informe o data de admissao do funcionário:");
        var dt_admissao = teclado.next(); teclado.nextLine();

        try {
            Funcionario funcionario = new Funcionario(nome, cpf, dt_nascimento, cargo, salario, dt_admissao);
            listaFuncionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void listarFuncionarios() {
        listaFuncionarios.forEach(elemento -> {
            System.out.println(
                "Nome: " + elemento.getNome() + " " +
                "CPF: " + elemento.getCpf() + " " +
                "Data de nascimento: " + elemento.getDt_nascimento() + " " +
                "Salário: R$ " + elemento.getSalario() + " " +
                "Cargo: " + elemento.getCargo() + " " +
                "Data de admissão: " + elemento.getData_admissao()
            );
        });
    }

}
