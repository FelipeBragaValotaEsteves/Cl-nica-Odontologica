package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Consulta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-12T21:17:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Arquivo.class)
public class Arquivo_ { 

    public static volatile SingularAttribute<Arquivo, Integer> id;
    public static volatile SingularAttribute<Arquivo, String> caminho;
    public static volatile SingularAttribute<Arquivo, Consulta> consulta;

}