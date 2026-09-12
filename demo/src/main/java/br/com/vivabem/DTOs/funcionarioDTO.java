package br.com.vivabem.DTOs;

import java.util.Scanner;

import br.com.vivabem.controllers.funcionarioController;

public class funcionarioDTO {

    private static Scanner teclado = new Scanner(System.in);

    public static void cadastrarFuncionario() {
        
        System.out.println("=============== Cadastrando funcionário... ===============");
        System.out.println("Nome: ");
        String nome = teclado.nextLine();

        System.out.println("CPF: ");
        String cpf = teclado.nextLine();

        System.out.println("Cargo: ");
        String cargo = teclado.nextLine();

        funcionarioController.cadastrarFuncionario(nome, cpf, cargo);
    }

    public static void listarFuncionarios() {
        funcionarioController.listarFuncionarios();
    }

    public static void removerFuncionario() {
        System.out.println("=============== Removendo funcionário... ===============");
        System.out.println("ID do funcionário a ser removido: ");
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        funcionarioController.removerFuncionario(id);
    }

    public static void editarFuncionario() {
        System.out.println("=============== Editando funcionário... ===============");
        System.out.println("ID do funcionário a ser editado: ");
        Integer id = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do teclado

        System.out.println("Novo nome: ");
        String nome = teclado.nextLine();

        System.out.println("Novo CPF: ");
        String cpf = teclado.nextLine();

        System.out.println("Novo cargo: ");
        String cargo = teclado.nextLine();

        funcionarioController.editarFuncionario(id, nome, cpf, cargo);
    }

}
