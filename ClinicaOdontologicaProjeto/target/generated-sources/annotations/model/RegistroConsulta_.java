package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Consulta;
import model.Prontuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T21:17:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(RegistroConsulta.class)
public class RegistroConsulta_ { 

    public static volatile SingularAttribute<RegistroConsulta, Prontuario> prontuario;
    public static volatile SingularAttribute<RegistroConsulta, Integer> id;
    public static volatile SingularAttribute<RegistroConsulta, Consulta> consulta;
    public static volatile SingularAttribute<RegistroConsulta, String> descricao;

}