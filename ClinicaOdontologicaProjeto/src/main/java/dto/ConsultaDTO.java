package dto;

import java.util.LinkedList;
import java.util.List;
import model.Consulta;
import model.FormaPagamento;
import model.RegistroConsulta;

public class ConsultaDTO extends DTO {

    public String observacao;
    public FuncionarioDTO funcionario;
    public PacienteDTO paciente;
    public RegistroConsultaDTO registroConsulta;
    public Float valor;
    public FormaPagamento formaPagamento;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id != null ? Long.valueOf(id) : 0l);
        consulta.setObservacao(observacao);
        consulta.setFuncionario(funcionario.builder());
        consulta.setPaciente(paciente.builder());
        consulta.setValor(valor);
        consulta.setRegistroConsulta((RegistroConsulta) registroConsulta.builder());
        consulta.setFormaPagamento(formaPagamento);

        return consulta;
    }

    public List getListaDados(List<Consulta> dados) {
        List dadosDTO = new LinkedList();
        for (Consulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Consulta c) {
        ConsultaDTO dto = new ConsultaDTO();
        dto.id = c.getId();
        dto.observacao = c.getObservacao();
        FuncionarioDTO funcDto = new FuncionarioDTO();
        dto.funcionario = (FuncionarioDTO) funcDto.converte(c.getFuncionario());
        PacienteDTO pacDto = new PacienteDTO();
        dto.paciente = (PacienteDTO) pacDto.converte(c.getPaciente());
        dto.valor = c.getValor();
        dto.formaPagamento = c.getFormaPagamento();
        RegistroConsultaDTO regDto = new RegistroConsultaDTO();
        dto.registroConsulta = (RegistroConsultaDTO) regDto.converte(c.getRegistroConsulta());
        return dto;
    }
}
