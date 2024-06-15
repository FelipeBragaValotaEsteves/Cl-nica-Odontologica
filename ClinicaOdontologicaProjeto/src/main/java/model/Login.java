package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Entity
@Getter
@Setter
public @Data
class Login implements Serializable, Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String senha;
    @OneToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Usuário", "Senha", "Funcionário"};
    }

    @Override
    public String[] getFiltros() {
        return new String[]{"Usuário"};
    }
}
