package controller;

import dto.DTO;
import dto.ProntuarioDTO;
import java.util.List;
import model.Prontuario;
import persistence.prontuario.ProntuarioDao;
import persistence.prontuario.ProntuarioImpl;

public class ProntuarioController implements Controller {

    ProntuarioDao dao = new ProntuarioImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        ProntuarioDTO pacienteDTO = (ProntuarioDTO) dto;

        if (validaCampos(pacienteDTO)) {
            dao.atualiza(pacienteDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((ProntuarioDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Prontuario prontuario = new Prontuario();
        return prontuario.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Prontuario prontuario = new Prontuario();
        return prontuario.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        ProntuarioDTO dto = (ProntuarioDTO) o;
        return new Object[]{dto.id, dto.idPaciente};
    }

    @Override
    public List getListaDados() {
        List<Prontuario> dados = dao.listar(Prontuario.class);
        ProntuarioDTO prontuarioDTO = new ProntuarioDTO();
        return prontuarioDTO.getListaDados(dados);
    }
    
    public boolean validaCampos(ProntuarioDTO prontuario) {

        if (prontuario.idPaciente == null) {
            return false;
        }
        
        return true;
    }
}
