package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public @Data class Consulta implements Serializable, Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @Lob
    private String observacao;
    @Temporal(TemporalType.DATE)
    private Date dataConsulta;
    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;
    @OneToOne(cascade = CascadeType.ALL)
    private RegistroConsulta registroConsulta;
    private Float valor;
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    public String[] getTitulosColunas() {
        return new String[]{"Id", "Funcionário", "Paciente", "Valor", "Pagamento"};
    }

    public String[] getFiltros() {
        return new String[]{"Funcionário", "Paciente", "Valor", "Pagamento"};
    }
}
