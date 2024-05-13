package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Entity
@Getter
@Setter
public @Data class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private Integer numeroCasa;
    private String complemento;
    private String convenio;
    private Contato contato;
    private String email;
    private String responsavel;
    @OneToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;
}
