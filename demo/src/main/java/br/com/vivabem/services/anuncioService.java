package br.com.vivabem.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.vivabem.modelo.Anuncio;

public class anuncioService {

    public static File arquivo = new File("src\\main\\java\\br\\com\\vivabem\\resources\\anuncios\\anuncios.txt");

    public static void cadastrarAnuncio(Anuncio anuncio) {
        try (var bw = new BufferedWriter(new FileWriter((arquivo)))) {
            bw.write("ID: " + anuncio.getId() + "\n");
            bw.write("Título: " + anuncio.getTitulo() + "\n");
            bw.write("Descrição: " + anuncio.getDescricao() + "\n");
            bw.write("---\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listarAnuncios() {
        try (var br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarAnuncio(Anuncio anuncio) throws IOException {
        var bw = new BufferedWriter(new FileWriter(arquivo));
        var br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            if (linha.startsWith("ID: ")) {
                Integer anuncio_id = Integer.parseInt(linha.substring(4));
                if (anuncio_id.equals(anuncio.getId())) {
                    bw.write("ID: " + anuncio.getId() + "\n");
                    bw.write("Título: " + anuncio.getTitulo() + "\n");
                    bw.write("Descrição: " + anuncio.getDescricao() + "\n");
                    bw.write("---\n");
                }
            }
        }
    }

    public static void consultarAnuncio(Integer id) {

        Integer anuncio_id;
        String anuncio_titulo;
        String anuncio_descricao;
        String linha;

        try (var br = new BufferedReader(new FileReader(arquivo))) {
            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("ID: ")) {
                    anuncio_id = Integer.parseInt(linha.substring(4));
                    if (anuncio_id.equals(id)) {
                        anuncio_titulo = br.readLine().substring(8);
                        anuncio_descricao = br.readLine().substring(12);
                        System.out.println("ID: " + anuncio_id);
                        System.out.println("Título: " + anuncio_titulo);
                        System.out.println("Descrição: " + anuncio_descricao);
                        return;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
