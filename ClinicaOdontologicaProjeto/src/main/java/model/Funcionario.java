package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public @Data
class Funcionario implements Serializable, Model {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String rg;
    @OneToOne
    @JoinColumn(name = "login_id")
    private Login login;

    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    public String[] getFiltros() {
        return new String[]{"id", "Nome", "RG"};
    }
}
