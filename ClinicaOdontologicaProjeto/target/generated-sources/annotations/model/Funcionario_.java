package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Agendamento;
import model.Consulta;
import model.Funcao;
import model.Login;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-15T03:37:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Funcao> funcao;
    public static volatile ListAttribute<Funcionario, Agendamento> agendamentos;
    public static volatile SingularAttribute<Funcionario, String> rg;
    public static volatile ListAttribute<Funcionario, Consulta> consultas;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Long> id;
    public static volatile SingularAttribute<Funcionario, Login> login;

}