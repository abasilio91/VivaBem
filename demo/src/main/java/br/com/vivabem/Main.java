package br.com.vivabem;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static int exibirMenu() {
        System.out.println("""
            VivaBem Adminstrador de Condomínio - ESCOLHA UMA OPÇÃO:
            1 - Listar Funcionários
            2 - Listar Moradores
            3 - Adicionar Funcionario
            4 - Adicionar Moradores
            5 - Buscar Funcionário
            6 - Sair
            """);
        return teclado.nextInt();
    }

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
            Funcionario fun = new Funcionario(nome, cpf, dt_nascimento, cargo, salario, dt_admissao);
            System.out.println("Funcionario criado com sucesso");

            Funcionario.createFuncionario(fun);
            System.out.println("Funcionário adicionado com sucesso!");      
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static void main(String[] args) {
        var opcao = exibirMenu();
        // System.out.println("Opção selecionada: " + opcao);
        while (opcao != 6) {
            try {
                switch(opcao) {
                    case 1 ->  System.out.println("Não implementado 1");
                    case 2 ->  System.out.println("Não implementado 2");
                    case 3 ->  adicionaFuncionario();
                    case 4 ->  System.out.println("Não implementado 4");
                    case 5 ->  System.out.println("Não implementado 5");
                    default -> System.out.println("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                teclado.next();
            }
            opcao = exibirMenu();
        }
        System.out.println("Finalizando a aplicação.");
    }
}