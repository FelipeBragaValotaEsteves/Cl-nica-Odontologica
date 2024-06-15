package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String rg;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "funcionario")
    private Login login;
    @OneToMany(mappedBy = "funcionario")
    private List<Agendamento> agendamentos;
    @OneToMany(mappedBy = "funcionario")
    private List<Consulta> consultas;
    @Enumerated(EnumType.STRING)
    private Funcao funcao;
    
    public String[] getTitulosColunas() {
        return new String[]{"Id", "Nome", "RG"};
    }

    public String[] getFiltros() {
        return new String[]{"Nome", "RG"};
    }
}
