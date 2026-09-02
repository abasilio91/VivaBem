package br.com.vivabem.menu;

import java.util.Scanner;

import br.com.vivabem.modelo.NaoImplementado;

public class financeiro {

    private static Scanner teclado = new Scanner(System.in);

    public static void exibirMenuFinanceiro() {
        System.out.println("""
            
        ------------------- VivaBem - Financeiro ------------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Cadastrar despesa
            2 - Listar despesas
            3 - Editar despesa
            4 - Excluir despesa
            0 - Voltar ao menu principal
        -----------------------------------------------------------
            """);
    }

public static void Run() {
        exibirMenuFinanceiro();
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
                    financeiro.Run();
            }
        }
        catch (Exception e) {
            System.out.print(e);
            teclado.nextLine();
            financeiro.Run();
        }
    }
}
