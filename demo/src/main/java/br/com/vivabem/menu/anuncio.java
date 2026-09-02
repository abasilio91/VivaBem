package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.modelo.NaoImplementado;

public class anuncio {

    private static Scanner teclado = new Scanner(System.in);

    public static void exibirMenuAnuncio() {
        System.out.println("""
            
        ------------------- VivaBem - Anuncios --------------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Cadastrar anúncio
            2 - Listar anúncios
            3 - Editar anúncio
            4 - Excluir anúncio
            0 - Voltar ao menu principal
        -----------------------------------------------------------
            """);
    }

    public static void Run() {
        exibirMenuAnuncio();
        System.out.print("Digite a opcao desejada: ");
        int opcao = teclado.nextInt(); 
        try{

            switch (opcao) {
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
                    anuncio.Run();
            }
        }
        catch (Exception e) {
            System.out.print(e);
            teclado.nextLine();
            anuncio.Run();
        }
    }
}
