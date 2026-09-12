package br.com.vivabem.services;

import java.util.List;

import br.com.vivabem.modelo.Funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class funcionarioService {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VivaBemPU");
    static EntityManager em = emf.createEntityManager();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        try {
            em.getTransaction().begin();
            em.persist(funcionario);    
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Funcionario> listarFuncionarios() {
        try {
            List<Funcionario> funcionarios = em.createQuery("SELECT f FROM Funcionario f", 
                                                            Funcionario.class)
                                                .getResultList();
            em.close();
            return funcionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void removerFuncionario(Integer id) {
        try {
            em.getTransaction().begin();
            Funcionario funcionario = em.find(Funcionario.class, id);
            if (funcionario != null) {
                em.remove(funcionario);
                em.getTransaction().commit();
                em.close();
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarFuncionario(Integer id, String nome, String cpf, String cargo) {
        try {
            em.getTransaction().begin();
            Funcionario funcionario = em.find(Funcionario.class, id);
            if (funcionario != null) {
                funcionario.setNome(nome);
                funcionario.setCpf(cpf);
                funcionario.setCargo(cargo);
                em.merge(funcionario);
                em.getTransaction().commit();
                em.close();
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
