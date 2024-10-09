package br.com.vivabem.modelo;

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
