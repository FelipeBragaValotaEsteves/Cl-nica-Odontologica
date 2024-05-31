package dto;

import java.util.LinkedList;
import java.util.List;
import model.Prontuario;
import persistence.paciente.PacienteImpl;

public class ProntuarioDTO extends DTO {

    public Long idPaciente;

    @Override
    public Object builder() {
        Prontuario prontuario = new Prontuario();
        prontuario.setId(id != null ? Long.valueOf(id) : 0l);
        PacienteImpl pac = new PacienteImpl();
        prontuario.setPaciente(pac.getPacienteById());

        return prontuario;
    }

    public List getListaDados(List<Prontuario> dados) {
        List dadosDTO = new LinkedList();
        for (Prontuario dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Prontuario p) {
        ProntuarioDTO dto = new ProntuarioDTO();
        dto.id = p.getId().toString();
        dto.idPaciente = p.getPaciente().getId();

        return dto;
    }
}
