package controller;

import dto.DTO;
import dto.RegistroConsultaDTO;
import java.util.List;
import model.RegistroConsulta;
import persistence.registroconsulta.RegistroConsultaDao;
import persistence.registroconsulta.RegistroConsultaImpl;

public class RegistroConsultaController implements Controller {

    RegistroConsultaDao dao = new RegistroConsultaImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        RegistroConsultaDTO registroConsultaDTO = (RegistroConsultaDTO) dto;

        if (validaCampos(registroConsultaDTO)) {
            dao.atualiza(registroConsultaDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((RegistroConsultaDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        RegistroConsulta registroConsulta = new RegistroConsulta();
        return registroConsulta.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        RegistroConsulta registroConsulta = new RegistroConsulta();
        return registroConsulta.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        RegistroConsultaDTO dto = (RegistroConsultaDTO) o;
        return new Object[]{dto.id, dto.descricao};
    }

    @Override
    public List getListaDados() {
        List<RegistroConsulta> dados = dao.listar(RegistroConsulta.class);
        RegistroConsultaDTO funcionarioDTO = new RegistroConsultaDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    public boolean validaCampos(RegistroConsultaDTO registroConsulta) {

        if (registroConsulta.descricao == null || registroConsulta.descricao.isEmpty()) {
            return false;
        }

        if (registroConsulta.idConsulta == null) {
            return false;
        }

        if (registroConsulta.idProntuario == null) {
            return false;
        }

        return true;
    }
}
