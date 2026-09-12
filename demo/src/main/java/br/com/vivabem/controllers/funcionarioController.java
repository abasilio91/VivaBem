package br.com.vivabem.controllers;

import java.util.List;

import br.com.vivabem.modelo.Funcionario;
import br.com.vivabem.services.funcionarioService;

public class funcionarioController {

    public static void cadastrarFuncionario(String nome, String cpf, String cargo) {
        try {
            Funcionario funcionario = new Funcionario(nome, cpf, cargo);
            funcionarioService.cadastrarFuncionario(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar funcionário.");
        }
    }

    public static void listarFuncionarios() {

        List<Funcionario> funcionarios = funcionarioService.listarFuncionarios();

        try {
            System.out.println("=============== Listando funcionários... ===============");
            System.out.println("ID | Nome | CPF | Cargo");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getId() + " | " + funcionario.getNome() + " | " + funcionario.getCpf() + " | " + funcionario.getCargo());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao listar funcionários.");
        }
    }

    public static void removerFuncionario(Integer id) {
        try {
            funcionarioService.removerFuncionario(id);
            System.out.println("Funcionário removido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao remover funcionário.");
        }
    }

    public static void editarFuncionario(Integer id, String nome, String cpf, String cargo) {
        try {
            funcionarioService.editarFuncionario(id, nome, cpf, cargo);
            System.out.println("Funcionário editado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao editar funcionário.");
        }
    }
}
