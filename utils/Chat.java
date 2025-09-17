package utils;

public class Chat {
    public static void menu_principal() {
        String texto = Conteudo.menu_principal.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);

        switch (opcao) {
            case 1:
                Chat.menu_funcionarios();
                break;
            case 2:
                Chat.menu_moradores();
                break;
            case 3:
                Chat.menu_estatuto();
                break;
            case 4:
                Chat.menu_mensagens();
                break;
            case 5:
                Chat.menu_quem_somos();
                break;
            case 0:
                System.out.println("\nSaindo do sistema.\n\n");
                break;
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
                Chat.menu_principal();
        }
    }

    private static void menu_funcionarios() {
        String texto = Conteudo.menu_funcionarios.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);
    }
    private static void menu_moradores() {
        String texto = Conteudo.menu_moradores.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);
    }
    private static void menu_estatuto() {
        String texto = Conteudo.menu_estatuto.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);
    }
    private static void menu_mensagens() {
        String texto = Conteudo.menu_mensagens.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);
    }
    private static void menu_quem_somos() {
        String texto = Conteudo.menu_quem_somos.getDescricao();
        Integer opcao = Menus.menu_opcoes(texto);
    }
}
