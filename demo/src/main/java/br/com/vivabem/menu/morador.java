package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.modelo.NaoImplementado;
import br.com.vivabem.DTOs.moradorDTO;

public class morador {

    private static Scanner teclado = new Scanner(System.in);

    public static void exibirMenuMorador() {
        System.out.println("""
            
        ------------------- VivaBem - Moradores ------------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Cadastrar morador
            2 - Listar moradores
            3 - Editar morador
            4 - Excluir morador
            5 - Histórico do morador
            6 - Consultar morador
            0 - Voltar ao menu principal
        -----------------------------------------------------------
            """);
    }

public static void Run() {
        exibirMenuMorador();
        System.out.print( "Digite a opcao desejada: ");
        int opcao = teclado.nextInt();
        try {
            switch(opcao) {
                case 1:
                    moradorDTO.cadastrarMorador();
                    break;
                case 2:
                    moradorDTO.listarMoradores();
                    break;
                case 3:
                    moradorDTO.editarMorador();
                    break;
                case 4:
                    moradorDTO.removerMorador();
                    break;
                case 5:
                    NaoImplementado.exibirMensagemNaoImplementado();
                    break;
                case 6:
                    moradorDTO.consultarMorador();
                    break;
                case 0:
                    Inicial.Run();
                default:
                    System.out.println("Opção inválida. Por favor, digite uma das opções acima.");
                    teclado.nextLine();
                    morador.Run();
            }
        }
        catch (Exception e) {
            System.out.print(e);
            teclado.nextLine();
            morador.Run();
        }
    }
}
