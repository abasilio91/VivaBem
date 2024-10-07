package br.com.vivabem.modelo.morador;

import java.util.Scanner;

public class moradorDto {

    private static Scanner teclado = new Scanner(System.in);

    public static void adicionaMorador() {
        System.out.println("Informe o nome do morador:");
        var nome = teclado.next();

        System.out.println("Informe o CPF do morador:");
        var cpf = teclado.next();

        System.out.println("Informe a data de nascimento do morador:");
        var dt_nascimento = teclado.next();
        
        System.out.println("Informe o apartamento do morador:");
        var apartamento = teclado.next();

        try {
            Morador morador = new Morador(nome, cpf, dt_nascimento, apartamento);
            System.out.println("Morador adicionado com sucesso!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}
