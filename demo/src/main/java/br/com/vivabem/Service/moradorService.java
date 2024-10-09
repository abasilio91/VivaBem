package br.com.vivabem.Service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.vivabem.modelo.Morador;

public class moradorService {

    private static Set<Morador> listaMorador = new HashSet<Morador>();

    private static Scanner teclado = new Scanner(System.in);

    public static void adicionarMorador() {
        System.out.println("Informe o nome do morador:");
        var nome = teclado.nextLine();

        System.out.println("Informe o CPF do morador:");
        var cpf = teclado.next();

        System.out.println("Informe a data de nascimento do morador:");
        var dt_nascimento = teclado.next();
        
        System.out.println("Informe o apartamento do morador:");
        var apartamento = teclado.nextLine();

        try {
            Morador morador = new Morador(nome, cpf, dt_nascimento, apartamento);
            listaMorador.add(morador);
            System.out.println("Morador adicionado com sucesso!\n");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void listarMoradores() {
        listaMorador.forEach(elemento -> {
            System.out.println(
                "Nome: " + elemento.getNome() + " " +
                "CPF: " + elemento.getCpf() + " " +
                "Data de nascimento: " + elemento.getDt_nascimento() + " " +
                "Apartamento: " + elemento.getApartamento()
            );
        });
    }
}
