package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Entity
@Getter
@Setter
public @Data
class Material implements Serializable, Model {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 255)
    private String nome;
    private Integer qtdMinima;
    private Integer qtdEstoque;

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Id", "Nome", "Qtd mínima", "Qtd estoque"};
    }

    @Override
    public String[] getFiltros() {
        return new String[]{"Nome"};
    }

}
