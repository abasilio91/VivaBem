package vivabem.demo.src.main.java.br.com.vivabem;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Pessoa(String nome, String cpf, String dt_nascimento) throws Exception{
        setNome(nome);
        setCPF(cpf);
        setDataNascimento(dt_nascimento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }
    public void setCPF(String cpf) throws Exception {
        if (validaCPF(cpf)) {
            this.cpf = cpf;
        }
    }

    public boolean validaCPF(String cpf) throws Exception {        
        if (cpf.length() != 11) {
            throw new Exception("CPF inválido. Era esperado 11 digitos.");
        }
        
        if (cpf.charAt(9) != _primeiroDigito(cpf) || cpf.charAt(10) != _segundoDigito(cpf)) {
            throw new Exception("CPF inválido. Verifique os digitos.");
        }
        return true;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dt_nascimento;
    }

    private static char primeiroDigito(String cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '_primeiroDigito'");
    }

    private static char segundoDigito(String cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '_segundoDigito'");
    }
}
