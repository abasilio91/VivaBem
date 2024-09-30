public enum StatusFuncionario {
    ATIVO("ativo"), DEMITIDO("demitido"), AFASTADO("afastado"), CEDIDO("cedido");

    private String statusFuncionario;

    public String status(String status) {
        statusFuncionario = status;
    }

    public String getStatus() {
        return statusFuncionario;

    }
}
