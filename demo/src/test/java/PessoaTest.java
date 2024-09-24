package vivabem.demo.src.test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import vivabem.demo.src.main.java.br.com.vivabem.Pessoa;

public class PessoaTest {
    private Pessoa pessoa;

    @Before
    public void inicializar() {
        this.pessoa = new Pessoa("Joao Silva", "11144477735", "26/10/1993");
    }

    @Test
    public void deveriaRetornarTresParaPrimeiroDigitoDoCPF() {
        char actual = Pessoa._primeiroDigito("11144477735");
        char expected = '3';
        assertEquals(expected, actual);
    }

    @Test
    public void deveriaRetornarCincoParaSegundoDigitoDoCPF() {
        char actual = Pessoa._segundoDigito("11144477735");
        char expected = '5';
        assertEquals(expected, actual);
    }
}
