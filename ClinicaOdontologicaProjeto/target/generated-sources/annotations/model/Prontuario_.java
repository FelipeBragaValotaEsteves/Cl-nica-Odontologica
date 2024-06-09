package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Paciente;
import model.RegistroConsulta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-09T18:14:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Prontuario.class)
public class Prontuario_ { 

    public static volatile SingularAttribute<Prontuario, Paciente> paciente;
    public static volatile ListAttribute<Prontuario, RegistroConsulta> registrosConsultas;
    public static volatile SingularAttribute<Prontuario, Long> id;

}