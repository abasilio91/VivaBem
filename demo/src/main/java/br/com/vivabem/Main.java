package br.com.vivabem;

public class Main {

    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static int exibirMenu() {
        System.out.println("""
            VivaBem Adminstrador de Condomínio - ESCOLHA UMA OPÇÃO:
            1 - Listar Funcionários
            2 - Listar Moradores
            3 - Adicionar Funcionario
            4 - Adicionar Moradores
            5 - Buscar Fucnionário
            6 - Sair
            """);
    return teclado.nextInt();
    }

    public void adicionaFuncionario() {
        System.out.println("Informe o nome do funcionario:");
        var nome = teclado.next();

        System.out.println("Informe o CPF do funcionario:");
        var cpf = teclado.next();

        System.out.println("Informe a data de nascimento do funcionario:");
        var dt_nascimento = teclado.next();
        
        System.out.println("Informe salario do funcionario:");
        var salario = teclado.NextDouble();
        
        System.out.println("Informe o cargo do funcionario:");
        var cargo = teclado.next();

        System.out.println("Informe o data de admissao do funcionario:");
        var dt_admissao = teclado.next();
        
        Funcionario fun = new Funcionario(nome, cpf, dt_nascimento, cargo, salario, data_admissao);
    }

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 6) {
            try {
                switch (opcao) {
                    case 1: "listarFuncionarios()"; break;
                    case 2: "listarMoradores()"; break;
                    case 3: adicionaFuncionario(); break;
                    case 4: "adicionaMorador()"; break;
                    case 5: "buscaFuncionario()"; break;
                }
            } catch (RegraDeNegocioException e) {
                System.out.println("Erro: " +e.getMessage());
                System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                teclado.next();
            }
            opcao = exibirMenu();
        }
        System.out.println("Finalizando a aplicação.");
    }
}