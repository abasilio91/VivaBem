package br.com.vivabem;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static int exibirMenu() {
        System.out.println("""
            VivaBem Adminstrador de Condomínio - ESCOLHA UMA OPÇÃO:
            1 - Listar Funcionários
            2 - Listar Moradores
            3 - Adicionar Funcionario
            4 - Adicionar Moradores
            5 - Buscar Fucnionário
            6 - Sair
            """);
        return teclado.nextInt();
    }

    public static void adicionaFuncionario() {
        System.out.println("Informe o nome do funcionário:");
        var nome = teclado.next();

        System.out.println("Informe o CPF do funcionario:");
        var cpf = teclado.next();

        System.out.println("Informe a data de nascimento do funcionario:");
        var dt_nascimento = teclado.next();
        
        System.out.println("Informe salario do funcionario:");
        var salario = teclado.nextDouble();
        
        System.out.println("Informe o cargo do funcionario:");
        var cargo = teclado.next();

        System.out.println("Informe o data de admissao do funcionario:");
        var dt_admissao = teclado.next();
        
        try {
            Funcionario fun = new Funcionario(nome, cpf, dt_nascimento, cargo, salario, dt_admissao);

            Funcionario.createFuncionario(fun);

            System.out.println("Funcionário adicionado com sucesso!");      
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 6) {
            try {
                switch(opcao) {
                    case 1 -> System.out.println("Não implementado 1");
                    case 2 -> System.out.println("Não implementado 2");
                    case 3 -> System.out.println("Não implementado 3");
                    case 4 -> System.out.println("Não implementado 4");
                    case 5 -> System.out.println("Não implementado 5");
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