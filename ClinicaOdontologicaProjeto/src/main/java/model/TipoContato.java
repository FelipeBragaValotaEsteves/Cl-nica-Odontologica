package model;

public enum TipoContato {
    EMAIL("email"),
    TELEFONE("telefone"),
    CELULAR("celular");
    
    private String descricao;
    
    TipoContato(String descricao) {
        this.descricao = descricao;
    }
}
