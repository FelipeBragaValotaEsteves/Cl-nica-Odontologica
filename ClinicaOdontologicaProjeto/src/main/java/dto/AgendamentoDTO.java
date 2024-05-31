package dto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import model.Agendamento;
import persistence.funcionario.FuncionarioImpl;
import persistence.paciente.PacienteImpl;

public class AgendamentoDTO extends DTO {

    public Date data;
    public Date hora;
    public Long idFuncionario;
    public Long idPaciente;

    @Override
    public Object builder() {
        Agendamento agedamento = new Agendamento();
        agedamento.setId(id != null ? Long.valueOf(id) : 0l);
        agedamento.setHora(hora);
        FuncionarioImpl func = new FuncionarioImpl();
        agedamento.setFuncionario(func.getFuncById());
        PacienteImpl pac = new PacienteImpl();
        agedamento.setPaciente(pac.getPacienteById());

        return agedamento;
    }

    public List getListaDados(List<Agendamento> dados) {
        List dadosDTO = new LinkedList();
        for (Agendamento dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Agendamento a) {
        AgendamentoDTO dto = new AgendamentoDTO();
        dto.id = a.getId().toString();
        dto.data = a.getData();
        dto.hora = a.getHora();
        dto.idFuncionario = a.getFuncionario().getId();
        dto.idPaciente = a.getPaciente().getId();
        dto.data = a.getData();

        return dto;
    }
}
