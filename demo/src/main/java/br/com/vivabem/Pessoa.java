package vivabem.demo.src.main.java.br.com.vivabem;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Pessoa(String nome, String cpf, String dt_nascimento) throws Exception {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;

        if (Validador.validaCPF(cpf)){
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDt_nascimento() {
        return this.dt_nascimento;
    }
}
