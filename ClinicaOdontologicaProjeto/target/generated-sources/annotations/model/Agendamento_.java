package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Funcionario;
import model.Paciente;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T00:31:24", comments="EclipseLink-2.7.12.v20230209-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-14T12:39:59", comments="EclipseLink-2.7.12.v20230209-rNA")
>>>>>>> main
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, Date> hora;
    public static volatile SingularAttribute<Agendamento, Paciente> paciente;
    public static volatile SingularAttribute<Agendamento, Long> id;
    public static volatile SingularAttribute<Agendamento, Funcionario> funcionario;

}