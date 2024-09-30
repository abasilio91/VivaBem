package br.com.vivabem;

public enum StatusFuncionario {
    ATIVO("ativo"),
    DEMITIDO("demitido"),
    AFASTADO("afastado"),
    CEDIDO("cedido");

    private final String status;

    StatusFuncionario(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
