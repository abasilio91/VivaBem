package br.com.vivabem.DTOs;

import java.util.Scanner;
import br.com.vivabem.controllers.anuncioController;

public class anuncioDTO {

    private static Scanner teclado = new Scanner(System.in);

    public static void cadastrarAnuncio() {
        System.out.println("Cadastro de Anúncio");
        System.out.print("Digite o título do anúncio: ");
        String titulo = teclado.nextLine();
        System.out.print("Digite a descrição do anúncio: ");
        String descricao = teclado.nextLine();

        anuncioController.cadastrarAnuncio(titulo, descricao);
    }

    public static void listarAnuncios() {
        anuncioController.listarAnuncios();
    }

    public static void editarAnuncio() {
        System.out.println("Edição de Anúncio");
        System.out.print("Digite o ID do anúncio que deseja editar: "); 
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o novo título do anúncio: ");
        String titulo = teclado.nextLine();
        System.out.print("Digite a nova descrição do anúncio: ");
        String descricao = teclado.nextLine();

        anuncioController.editarAnuncio(id, titulo, descricao);
    }

    public static void consultarAnuncio() {
        System.out.println("Consulta de Anúncio");
        System.out.print("Digite o ID do anúncio que deseja consultar: ");
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do scanner

        anuncioController.consultarAnuncio(id);
    }

}
