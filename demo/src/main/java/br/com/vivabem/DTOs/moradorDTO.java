package br.com.vivabem.DTOs;

import java.util.Scanner;

import br.com.vivabem.controllers.moradorController;

public class moradorDTO {

    private static Scanner teclado = new Scanner(System.in);

    public static void cadastrarMorador() {
        
        System.out.println("=============== Cadastrando morador... ===============");
        System.out.println("Nome: ");
        String nome = teclado.nextLine();

        System.out.println("CPF: ");
        String cpf = teclado.nextLine();

        System.out.println("Apartamento: ");
        Integer apartamento = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        moradorController.cadastrarMorador(nome, cpf, apartamento);
    }

    public static void listarMoradores() {
        moradorController.listarMoradores();
    }

    public static void removerMorador() {
        System.out.println("=============== Removendo morador... ===============");
        System.out.println("ID do morador a ser removido: ");
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        moradorController.removerMorador(id);
    }

    public static void editarMorador() {
        System.out.println("=============== Editando morador... ===============");
        System.out.println("ID do morador a ser editado: ");
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        System.out.println("Novo nome: ");
        String nome = teclado.nextLine();

        System.out.println("Novo CPF: ");
        String cpf = teclado.nextLine();

        System.out.println("Novo apartamento: ");
        Integer apartamento = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        moradorController.editarMorador(id, nome, cpf, apartamento);
    }

    public static void consultarMorador() {
        System.out.println("=============== Consultando morador... ===============");
        System.out.println("ID do morador a ser consultado: ");
        Integer id = teclado.nextInt();

        moradorController.consultarMorador(id);
    }
}
