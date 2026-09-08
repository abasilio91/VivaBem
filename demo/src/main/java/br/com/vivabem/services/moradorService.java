package br.com.vivabem.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.vivabem.modelo.Morador;

public class moradorService {

    private static Map<Integer, Morador> listaMoradores = new HashMap<>();

    public static void cadastrarMorador(Morador morador) {
        try {
            listaMoradores.put(morador.getId(), morador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Morador> listarMoradores() {
        try {
            return listaMoradores.values().stream().toList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void removerMorador(Integer id) {
        try {
            listaMoradores.remove(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarMorador(Integer id, Morador novosDados) {
        try {
            listaMoradores.put(id, novosDados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Morador consultarMorador(Integer id) {
        try {
            return listaMoradores.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
