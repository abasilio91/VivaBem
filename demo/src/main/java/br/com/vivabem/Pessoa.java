package br.com.vivabem;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Pessoa(String nome, String cpf, String dt_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
    }

    public static boolean validaCPF(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido. Era esperado 11 digitos.");
        }
        if (!verificaDigitos(cpf, 1) || !   verificaDigitos(cpf, 2)) {
            throw new IllegalArgumentException("CPF inválido. Verifique os digitos.");
        }
        return true;
    }

    private static boolean verificaDigitos(String cpf, int digito) {
        int resto;
        int dig;
        int dig_real = 0;
        int soma = 0;
        int multiplicador = 0;
        String cpf_substring = "";
        
        if (digito == 1) {
            multiplicador = 10;
            cpf_substring = cpf.substring(0,9);
            dig_real = cpf.charAt(9);
        } 
        
        if (digito == 2) {       
            multiplicador = 11;
            cpf_substring = cpf.substring(0,10);
            dig_real = cpf.charAt(10);
        }


        for (char letra : cpf_substring.toCharArray()) {
            soma += (letra - '0') * multiplicador;
            multiplicador --;
        }
        resto = soma % 11;

        dig = (resto < 2) ? 0 : 11 - resto;
        return dig == (dig_real -'0');
    }
}
