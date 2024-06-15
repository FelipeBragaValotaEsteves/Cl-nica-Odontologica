package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Consulta;
import model.Prontuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T00:31:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(RegistroConsulta.class)
public class RegistroConsulta_ { 

    public static volatile SingularAttribute<RegistroConsulta, Prontuario> prontuario;
    public static volatile SingularAttribute<RegistroConsulta, Long> id;
    public static volatile SingularAttribute<RegistroConsulta, Consulta> consulta;
    public static volatile SingularAttribute<RegistroConsulta, String> descricao;

}