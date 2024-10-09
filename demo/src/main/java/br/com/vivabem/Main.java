package br.com.vivabem;

import java.util.Scanner;

import br.com.vivabem.Service.funcionarioService;
import br.com.vivabem.Service.moradorService;

public class Main {

    private static Scanner teclado = new Scanner(System.in);
    
    public static int exibirMenu() {
        System.out.println("""
            
        VivaBem Adminstrador de Condomínio
            
            ESCOLHA UMA OPÇÃO:
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
        while (opcao != 6) {
            try {
                switch(opcao) {
                    case 1 ->  funcionarioService.listarFuncionarios();
                    case 2 ->  moradorService.listarMoradores();
                    case 3 ->  funcionarioService.adicionarFuncionario();
                    case 4 ->  moradorService.adicionarMorador();
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