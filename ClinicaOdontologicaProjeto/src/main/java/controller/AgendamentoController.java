package controller;

import dto.AgendamentoDTO;
import dto.DTO;
import java.util.List;
import model.Agendamento;
import persistence.agendamento.AgendamentoDao;
import persistence.agendamento.AgendamentoImpl;

public class AgendamentoController implements Controller {
    
    AgendamentoDao dao = new AgendamentoImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
          AgendamentoDTO agendamentoDTO = (AgendamentoDTO) dto;

        if (validaCampos(agendamentoDTO)) {
            dao.atualiza(agendamentoDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
         dao.remove(((AgendamentoDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Agendamento ag = new Agendamento();
        return ag.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Agendamento ag = new Agendamento();
        return ag.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        AgendamentoDTO dto = (AgendamentoDTO) o;
        return new Object[]{dto.id, dto.data, dto.hora, dto.funcionario, dto.paciente};
    }

    @Override
    public List getListaDados() {
        List<Agendamento> dados = dao.listar(Agendamento.class);
        AgendamentoDTO agendamentoDTO = new AgendamentoDTO();
        return agendamentoDTO.getListaDados(dados);
    }
    
    public boolean validaCampos(AgendamentoDTO ag) {
        if (ag.data == null) {
            return false;
        }

        if (ag.hora == null) {
            return false;
        }
        
        if (ag.funcionario == null) {
            return false;
        }
        
        if (ag.paciente == null) {
            return false;
        }
        return true;
    }
    
}
