package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Dentista;
import model.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T21:17:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, Date> hora;
    public static volatile SingularAttribute<Agendamento, Paciente> paciente;
    public static volatile SingularAttribute<Agendamento, Dentista> dentista;
    public static volatile SingularAttribute<Agendamento, Integer> id;

}