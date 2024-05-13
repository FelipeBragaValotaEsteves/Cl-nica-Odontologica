package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Entity
@Getter
@Setter
public @Data class RegistroConsulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String descricao;
    @OneToOne
    @JoinColumn(name = "consulta_id")
    private Consulta consulta;
    @ManyToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;
}
