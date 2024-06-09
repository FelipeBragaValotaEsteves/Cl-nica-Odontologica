package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id")
    private Login login;
    @OneToMany(mappedBy = "funcionario")
    private List<Agendamento> agendamentos;
    @OneToMany(mappedBy = "funcionario")
    private List<Consulta> consultas;
    private Funcao funcao;
    
    public String[] getTitulosColunas() {
        return new String[]{"Id", "Nome", "RG"};
    }

    public String[] getFiltros() {
        return new String[]{"Nome", "RG"};
    }
}
