package dto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import model.Agendamento;

public class AgendamentoDTO extends DTO {

    public Date data;
    public Date hora;
    public FuncionarioDTO funcionario;
    public PacienteDTO paciente;

    @Override
    public Object builder() {
        Agendamento agendamento = new Agendamento();
        agendamento.setId(id != null ? Long.valueOf(id) : 0l);
        agendamento.setHora(hora);
        agendamento.setFuncionario(funcionario.builder());
        agendamento.setPaciente(paciente.builder());

        return agendamento;
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
        dto.id = a.getId();
        dto.data = a.getData();
        dto.hora = a.getHora();
        FuncionarioDTO funcDto = new FuncionarioDTO();
        dto.funcionario = (FuncionarioDTO) funcDto.converte(a.getFuncionario());
        PacienteDTO pacDto = new PacienteDTO();
        dto.paciente = (PacienteDTO) pacDto.converte(a.getPaciente());
        dto.data = a.getData();

        return dto;
    }
}
