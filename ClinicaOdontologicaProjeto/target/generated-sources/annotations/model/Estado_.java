package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidade;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T23:01:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> UF;
    public static volatile SingularAttribute<Estado, String> nome;
    public static volatile SingularAttribute<Estado, Long> id;
    public static volatile ListAttribute<Estado, Cidade> cidades;

}