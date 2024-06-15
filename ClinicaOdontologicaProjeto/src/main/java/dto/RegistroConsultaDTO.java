package dto;

import java.util.LinkedList;
import java.util.List;
import model.RegistroConsulta;
import persistence.consulta.ConsultaImpl;
import persistence.prontuario.ProntuarioImpl;
import model.Consulta;
import model.Funcionario;
import model.Paciente;

public class RegistroConsultaDTO extends DTO {

    public String descricao;
    public ConsultaDTO consulta;

    @Override
    public Object builder() {
        RegistroConsulta registroConsulta = new RegistroConsulta();
        registroConsulta.setId(id != null ? Long.valueOf(id) : 0l);
        registroConsulta.setDescricao(descricao);
        Consulta consultaModel = new Consulta();
        consultaModel.setId(consulta.id);
        consultaModel.setDataConsulta(consulta.data);
        consultaModel.setFormaPagamento(consulta.formaPagamento);
        consultaModel.setObservacao(consulta.observacao);
        consultaModel.setValor(consulta.valor);
        consultaModel.setFormaPagamento(consulta.formaPagamento);

        Funcionario func = new Funcionario();
        func.setId(consulta.funcionario.id);
        func.setFuncao(consulta.funcionario.funcao);
        func.setNome(consulta.funcionario.nomeFuncionario);
        func.setRg(consulta.funcionario.numeroRegistro);
        func.setNome(consulta.funcionario.nomeFuncionario);
        consultaModel.setFuncionario(func);

        Paciente pac = new Paciente();
        pac.setCpf(consulta.paciente.cpf);
        pac.setConvenio(consulta.paciente.convenio);
        pac.setComplemento(consulta.paciente.complemento);
        pac.setNome(consulta.paciente.nome);
        pac.setResponsavel(consulta.paciente.responsavel);
        pac.setId(consulta.paciente.id);
       
        consultaModel.setPaciente(pac);

        consultaModel.setRegistroConsulta(registroConsulta);
        registroConsulta.setConsulta(consultaModel);

        return registroConsulta;
    }

    public List getListaDados(List<RegistroConsulta> dados) {
        List dadosDTO = new LinkedList();
        for (RegistroConsulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(RegistroConsulta rc) {
        RegistroConsultaDTO dto = new RegistroConsultaDTO();
        dto.id = rc.getId();
        dto.descricao = rc.getDescricao();

        ConsultaDTO con = new ConsultaDTO();
        con.id = rc.getConsulta().getId();

        dto.consulta = con;
        return dto;
    }
}
