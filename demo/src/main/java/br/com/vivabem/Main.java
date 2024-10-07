package br.com.vivabem;

import java.util.Scanner;

import static br.com.vivabem.modelo.funcionario.funcionarioDto.adicionaFuncionario;
import static br.com.vivabem.modelo.morador.moradorDto.adicionaMorador;

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


    public static void main(String[] args) {
        var opcao = exibirMenu();
        // System.out.println("Opção selecionada: " + opcao);
        while (opcao != 6) {
            try {
                switch(opcao) {
                    case 1 ->  System.out.println("Não implementado 1");
                    case 2 ->  System.out.println("Não implementado 2");
                    case 3 ->  adicionaFuncionario();
                    case 4 ->  adicionaMorador();
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