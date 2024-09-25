
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vivabem.Pessoa;

public class PessoaTest {
    private Pessoa pessoa;
    private String cpf = "12352192757";
    private String nome = "joão silva";
    private String dt_nascimento = "26/10/1989";

    @BeforeEach
    public void criaPessoa() throws Exception {
        pessoa = new Pessoa(nome, cpf, dt_nascimento);
    }

    @Test
    public void deveriaValidarOCPF() throws Exception {
        boolean actual = Pessoa.validaCPF(cpf);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void deveriaFalharNaValidacaoDoCPFPorCausaDosDigitosVerificadores() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Pessoa.validaCPF("11144477708")
        );

        assertEquals("CPF inválido. Verifique os digitos.", thrown.getMessage());
    }

    @Test
    public void deveriaFalharNaValidacaoDoCPFPorTamanhoCPF() {
        Exception thrown = assertThrows(
            Exception.class,
            () -> Pessoa.validaCPF("111444777")
        );

        assertEquals("CPF inválido. Era esperado 11 digitos.", thrown.getMessage());
    }
}
