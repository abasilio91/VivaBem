package br.com.vivabem.menu;

import java.util.Scanner;

public class Inicial {

    private static Scanner teclado = new Scanner(System.in);

    private static void exibirMenuInicial() {
        System.out.println("""
            
        --------- VivaBem Adminstrador de Condomínio --------------
            
            ESCOLHA UMA OPÇÃO:
            1 - Funcionários
            2 - Moradores
            3 - Eventos
            4 - Financeiro
            5 - Notícias e avisos
            0 - Sair
        -----------------------------------------------------------
        """);
    }

    public static void Run() {
        try {
            exibirMenuInicial();
            System.out.print("Digite a opção desejada: ");
            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    funcionario.Run();
                    break;
                case 2:
                    morador.Run();
                    break;
                case 3:
                    evento.Run();
                    break;
                case 4:
                    financeiro.Run();
                    break;
                case 5:
                    anuncio.Run();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, digite uma das opções acima.");
                    teclado.nextLine();
                    Run();
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            teclado.nextLine(); // Limpa o buffer do scanner
            Run();
        }

    }    
}
