package dto;

import java.util.LinkedList;
import java.util.List;
import model.Consulta;
import model.FormaPagamento;
import persistence.funcionario.FuncionarioImpl;
import persistence.paciente.PacienteImpl;

public class ConsultaDTO extends DTO {

    public String observacao;
    public Long idFuncionario;
    public Long idPaciente;
    public Float valor;
    public FormaPagamento formaPagamento;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id != null ? Long.valueOf(id) : 0l);
        consulta.setObservacao(observacao);
        FuncionarioImpl func = new FuncionarioImpl();
        consulta.setFuncionario(func.getFuncById());
        PacienteImpl pac = new PacienteImpl();
        consulta.setPaciente(pac.getPacienteById());
        consulta.setValor(valor);
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

    private Object converte(Consulta a) {
        ConsultaDTO dto = new ConsultaDTO();
        dto.id = a.getId().toString();
        dto.observacao = a.getObservacao();
        dto.idFuncionario = a.getFuncionario().getId();
        dto.idPaciente = a.getPaciente().getId();
        dto.valor = a.getValor();
        dto.formaPagamento = a.getFormaPagamento();

        return dto;
    }
}
