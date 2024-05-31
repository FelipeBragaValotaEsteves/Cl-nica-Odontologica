package dto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import model.Paciente;

public class PacienteDTO extends DTO {

    public String nome;
    public String cpf;
    public Date dataNascimento;
    public Integer numeroCasa;
    public String complemento;
    public String convenio;
    public String email;
    public String responsavel;

    public Paciente builder() {
        Paciente paciente = new Paciente();
        paciente.setId(id != null ? Long.valueOf(id) : 01);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setDataNascimento(dataNascimento);
        paciente.setNumeroCasa(numeroCasa);
        paciente.setComplemento(complemento);
        paciente.setConvenio(convenio);
        paciente.setEmail(email);
        paciente.setResponsavel(responsavel);
        return paciente;
    }

    public List getListaDados(List<Paciente> dados) {
        List dadosDTO = new LinkedList();
        for (Paciente dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Paciente f) {

        PacienteDTO dto = new PacienteDTO();
        dto.id = f.getId().toString();
        dto.nome = f.getNome();
        dto.dataNascimento = f.getDataNascimento();
        dto.complemento = f.getComplemento();
        dto.convenio = f.getConvenio();
        dto.cpf = f.getCpf();
        dto.email = f.getEmail();
        dto.numeroCasa = f.getNumeroCasa();
        dto.responsavel = f.getResponsavel();

        return dto;
    }
}
