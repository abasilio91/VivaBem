
// import org.json.JSONObject;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import static org.mockito.Mockito.mock;

// import br.com.vivabem.Funcionario;

// public class ComunicacaoDBTest {

//     private Funcionario funcionario = mock(Funcionario.class);

//     @Test
//     public void DeveriaAcessarODBeRetornarOsDadosDeUmFuncionario() {
//         JSONObject funcionarioResposta = new JSONObject();
        
//         funcionarioResposta.put("nome","joao");
//         funcionarioResposta.put("cpf","11144477708");
//         funcionarioResposta.put("dt_nascimento","23/10/1983");
//         funcionarioResposta.put("cargo","porteiro");
//         funcionarioResposta.put("salario","2000.00");
//         funcionarioResposta.put("data_admissao","15/09/2023");

//         Mockito.when(Funcionario.getFuncionarioFromDB(0)).thenReturn(funcionarioResposta);
//     }
// }
