package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Paciente;
import model.TipoContato;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-15T03:37:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile SingularAttribute<Contato, String> informacao;
    public static volatile SingularAttribute<Contato, TipoContato> tipoContato;
    public static volatile SingularAttribute<Contato, Paciente> paciente;
    public static volatile SingularAttribute<Contato, Long> id;

}