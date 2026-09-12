package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.DTOs.funcionarioDTO;
import br.com.vivabem.modelo.NaoImplementado;

public class funcionario {
    private static Scanner teclado = new Scanner(System.in);

    private static void exibirMenuFuncionario() {
        System.out.println("""
            
        ------------------ VivaBem - Funcionários -----------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Cadastrar funcionário
            2 - Listar funcionários
            3 - Editar funcionário
            4 - Remover funcionário
            0 - Voltar ao menu principal
        -----------------------------------------------------------
            """);
    }

    public static void Run() {
        exibirMenuFuncionario();
        System.out.print( "Digite a opcao desejada: ");
        int opcao = teclado.nextInt();
        try {
            switch(opcao) {
                case 1:
                    funcionarioDTO.cadastrarFuncionario();
                    break;
                case 2:
                    funcionarioDTO.listarFuncionarios();
                    break;
                case 3:
                    funcionarioDTO.editarFuncionario();
                    break;
                case 4:
                    funcionarioDTO.removerFuncionario();
                    break;
                case 0:
                    Inicial.Run();
                default:
                    System.out.println("Opção inválida. Por favor, digite uma das opções acima.");
                    teclado.nextLine();
                    funcionario.Run();
            }
        }
        catch (Exception e) {
            System.out.print(e);
            teclado.nextLine();
            funcionario.Run();
        }
    }
}
