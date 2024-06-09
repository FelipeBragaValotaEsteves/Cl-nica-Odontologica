package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Agendamento;
import model.Consulta;
import model.Contato;
import model.Endereco;
import model.Prontuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T23:01:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Prontuario> prontuario;
    public static volatile SingularAttribute<Paciente, Endereco> endereco;
    public static volatile ListAttribute<Paciente, Agendamento> agendamentos;
    public static volatile ListAttribute<Paciente, Contato> contatos;
    public static volatile SingularAttribute<Paciente, Integer> numeroCasa;
    public static volatile SingularAttribute<Paciente, String> convenio;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, String> complemento;
    public static volatile ListAttribute<Paciente, Consulta> Consulta;
    public static volatile SingularAttribute<Paciente, String> cpf;
    public static volatile SingularAttribute<Paciente, Long> id;
    public static volatile SingularAttribute<Paciente, Date> dataNascimento;
    public static volatile SingularAttribute<Paciente, String> responsavel;

}