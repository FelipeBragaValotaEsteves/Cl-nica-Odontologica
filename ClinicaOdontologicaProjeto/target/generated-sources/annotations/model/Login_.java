package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Funcao;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T23:01:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Funcao> funcao;
    public static volatile SingularAttribute<Login, String> senha;
    public static volatile SingularAttribute<Login, String> usuario;
    public static volatile SingularAttribute<Login, Long> id;

}