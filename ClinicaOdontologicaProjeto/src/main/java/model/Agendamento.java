package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.*;

@Entity
@Getter
@Setter
public @Data
class Agendamento implements Serializable, Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    @Temporal(TemporalType.TIME)
    private Date hora;
    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Id", "Data", "Hora", "Funcionário", "Paciente"};
    }

    @Override
    public String[] getFiltros() {
        return new String[]{"Data", "Funcionário", "Paciente"};
    }
}
