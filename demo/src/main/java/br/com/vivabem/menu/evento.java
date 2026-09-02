package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.modelo.NaoImplementado;

public class evento {

    private static Scanner teclado = new Scanner(System.in);

    public static void exibirMenuEvento() {
        System.out.println("""
            
        -------------------- VivaBem - Eventos --------------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Cadastrar evento
            2 - Listar eventos
            3 - Editar evento
            4 - Excluir evento
            0 - Voltar ao menu principal
        -----------------------------------------------------------
            """);
    }

public static void Run() {
        exibirMenuEvento();
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
                    evento.Run();
            }
        }
        catch (Exception e) {
            System.out.print(e);
            teclado.nextLine();
            evento.Run();
        }
    }
}
