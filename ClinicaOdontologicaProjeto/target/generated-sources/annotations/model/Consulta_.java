package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Dentista;
import model.FormaPagamento;
import model.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T21:17:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, FormaPagamento> formaPagamento;
    public static volatile SingularAttribute<Consulta, String> observacao;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, Float> valor;
    public static volatile SingularAttribute<Consulta, Dentista> dentista;
    public static volatile SingularAttribute<Consulta, Integer> id;

}