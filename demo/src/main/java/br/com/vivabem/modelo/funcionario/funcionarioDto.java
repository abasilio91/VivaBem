package br.com.vivabem.modelo.funcionario;

import java.util.Scanner;

public class funcionarioDto {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void adicionaFuncionario() {
        System.out.println("Informe o nome do funcionário:");
        var nome = teclado.next();

        System.out.println("Informe o CPF do funcionário:");
        var cpf = teclado.next();

        System.out.println("Informe a data de nascimento do funcionário:");
        var dt_nascimento = teclado.next();
        
        System.out.println("Informe salario do funcionário:");
        var salario = teclado.nextDouble();
        
        System.out.println("Informe o cargo do funcionário:");
        var cargo = teclado.next();

        System.out.println("Informe o data de admissao do funcionário:");
        var dt_admissao = teclado.next();

        try {
            Funcionario funcionario = new Funcionario(nome, cpf, dt_nascimento, cargo, salario, dt_admissao);
            System.out.println("Funcionário adicionado com sucesso!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
