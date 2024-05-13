package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public @Data class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    @Lob
    private String observacao;
    @ManyToOne
    @JoinColumn(name="dentista_id")
    private Dentista dentista;
    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;
    private Float valor;
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;
}
