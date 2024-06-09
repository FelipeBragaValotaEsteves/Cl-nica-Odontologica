package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Entity
@Getter
@Setter
public @Data class Paciente implements Serializable, Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private Integer numeroCasa;
    private String complemento;
    private String convenio;
    private String responsavel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;
    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> Consulta;
    @OneToMany(mappedBy = "paciente")
    private List<Contato> contatos;

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Id", "Nome", "CPF", "Convenio", "Data de Nascimento"};
    }

    @Override
    public String[] getFiltros() {
        return new String[]{"Id", "Nome", "CPF"};
    }
}
