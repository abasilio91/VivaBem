
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vivabem.Validador;

public class ValidadorTest {
    private String cpf;

    @BeforeEach
    public void criCPF() {
        cpf = "11144477735";
    }
    
    @Test
    public void deveriaValidarOCPF() throws Exception {
        boolean actual = Validador.validaCPF(cpf);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void deveriaFalharNaValidacaoDoCPFPorCausaDosDigitosVerificadores() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Validador.validaCPF("11144477708")
        );

        assertEquals("CPF inválido. Verifique os digitos.", thrown.getMessage());
    }

    @Test
    public void deveriaFalharNaValidacaoDoCPFPorTamanhoCPF() {
        Exception thrown = assertThrows(
            Exception.class,
            () -> Validador.validaCPF("111444777")
        );

        assertEquals("CPF inválido. Era esperado 11 digitos.", thrown.getMessage());
    }
}
