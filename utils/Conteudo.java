package utils;

public enum Conteudo {
    menu_principal(
        """

        1 - Funcionários
        2 - Moradores
        3 - Estatuto
        4 - Mensagens
        5 - Quem somos
        0 - Sair
        
        Escolha uma opção: """
    ),
    menu_funcionarios(
        """

        1 - Buscar funcionário
        2 - Cadastrar funcionário
        3 - Alterar funcionário
        4 - Remover funcionário
        0 - Voltar
        
        Escolha uma opção: """
    ),
    menu_moradores(
        """

        1 - Buscar morador
        2 - Cadastrar morador
        3 - Alterar morador
        4 - Remover morador
        0 - Voltar
        
        Escolha uma opção: """
    ),
    menu_estatuto(
        """

        1 - Estatuto vigente
        2 - Atas
        3 - Calendário de reuniões
        0 - Voltar
        
        Escolha uma opção: """
    ),
    menu_mensagens(
        """

        1 - Mensagens abertas
        2 - Mensagens arquivadas
        3 - Comunicar morador
        0 - Voltar

        Escolha uma opção: """
    ),
    menu_quem_somos(
        """

        1 - A empresa
        2 - Contatos
        0 - Voltar
        
        Escolha uma opção: """
    );

    private String descricao;
    
    Conteudo(String descricao) {
        this.descricao = descricao;
    };
    public String getDescricao() {
        return descricao;
    }

}
