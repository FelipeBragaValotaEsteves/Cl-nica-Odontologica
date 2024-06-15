package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Endereco;
import model.Estado;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T00:31:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Estado> estado;
    public static volatile ListAttribute<Cidade, Endereco> enderecos;
    public static volatile SingularAttribute<Cidade, String> nome;
    public static volatile SingularAttribute<Cidade, Long> id;

}