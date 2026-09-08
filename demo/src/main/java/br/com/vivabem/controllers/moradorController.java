package br.com.vivabem.controllers;

import java.util.List;

import br.com.vivabem.modelo.Morador;
import br.com.vivabem.services.moradorService;

public class moradorController {

    public static void cadastrarMorador(String nome, String cpf, Integer apartamento) {
        try {
            Integer id = (int) (Math.random() * 1_000_000);
            Morador morador = new Morador(id, nome, cpf, apartamento);
            moradorService.cadastrarMorador(morador);
            System.out.println("Morador cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar morador.");
        }
    }

    public static void listarMoradores() {

        List<Morador> moradores = moradorService.listarMoradores();

        try {
            System.out.println("=============== Listando moradores... ===============");
            System.out.println("ID | Nome | CPF | Apartamento");
            for (Morador morador : moradores) {
                System.out.println(morador.getId() + " | " + morador.getNome() + " | " + morador.getCpf() + " | " + morador.getApartamento());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao listar moradores.");
        }
    }

    public static void removerMorador(Integer id) {
        try {
            moradorService.removerMorador(id);
            System.out.println("Morador removido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao remover morador.");
        }
    }

    public static void editarMorador(Integer id, String nome, String cpf, Integer apartamento) {
        try {
            Morador morador = new Morador(id, nome, cpf, apartamento);
            moradorService.editarMorador(id, morador);
            System.out.println("Morador editado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao editar morador.");
        }
    }

    public static void consultarMorador(Integer id) {
        try {
            Morador morador = moradorService.consultarMorador(id);
            if (morador != null) {
                System.out.println("Morador encontrado:");
                System.out.println("ID: " + morador.getId());
                System.out.println("Nome: " + morador.getNome());
                System.out.println("CPF: " + morador.getCpf());
                System.out.println("Apartamento: " + morador.getApartamento());
            } else {
                System.out.println("Morador não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao consultar morador.");
        }
    }

}
