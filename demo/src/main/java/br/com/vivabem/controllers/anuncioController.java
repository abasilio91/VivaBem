package br.com.vivabem.controllers;

import br.com.vivabem.modelo.Anuncio;
import br.com.vivabem.services.anuncioService;

public class anuncioController {

    public static void cadastrarAnuncio(String titulo, String descricao) {
        try {
            Integer id = (int) (Math.random() * 1_000_000);
            Anuncio anuncio = new Anuncio(id, titulo, descricao);
            anuncioService.cadastrarAnuncio(anuncio);
            System.out.println("Anúncio cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar anúncio.");
        }
    }

    public static void listarAnuncios() {
        anuncioService.listarAnuncios();
    }

    public static void editarAnuncio(Integer id, String titulo, String descricao) {
        Anuncio anuncio = new Anuncio(id, titulo, descricao);
        try {
            anuncioService.editarAnuncio(anuncio);
            System.out.println("Anúncio editado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao editar anúncio.");
        }
    }

    public static void consultarAnuncio(Integer id) {
        anuncioService.consultarAnuncio(id);
    }
}
