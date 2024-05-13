package model;

public enum FormaPagamento {
    CARTAO("cartão"),
    PIX("pix"),
    BOLETO("boleto"),
    DINHEIRO("dinheiro");
    
    private String descricao;
    
    FormaPagamento(String descricao) {
        this.descricao = descricao;
    }
}
