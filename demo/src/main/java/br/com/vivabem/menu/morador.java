package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.modelo.NaoImplementado;

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
                    NaoImplementado.exibirMensagemNaoImplementado();
                    break;
                case 2:
                    NaoImplementado.exibirMensagemNaoImplementado();
                    break;
                case 3:
                    NaoImplementado.exibirMensagemNaoImplementado();
                    break;
                case 4:
                    NaoImplementado.exibirMensagemNaoImplementado();
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
