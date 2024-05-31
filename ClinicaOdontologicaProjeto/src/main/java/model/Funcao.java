package model;

public enum Funcao {
    DENTISTA("dentista"),
    RECEPCIONISTA("recepcionista"),
    GERENTE("gerente");

    private String descricao;

    Funcao(String descricao) {
        this.descricao = descricao;
    }
}
