package controller;

import dto.DTO;
import dto.EstadoDTO;
import java.util.List;
import model.Estado;
import persistence.estado.EstadoDao;
import persistence.estado.EstadoImpl;

public class EstadoController implements Controller {

    EstadoDao dao = new EstadoImpl();

    public List getListaDados() {
        List<Estado> dados = dao.listar(Estado.class);
        EstadoDTO estadoDTO = new EstadoDTO();
        return estadoDTO.getListaDados(dados);
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        EstadoDTO estadoDTO = (EstadoDTO) dto;

        if (validaCampos(estadoDTO)) {
            dao.atualiza(estadoDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((EstadoDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Estado estado = new Estado();
        return estado.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Estado estado = new Estado();
        return estado.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        EstadoDTO dto = (EstadoDTO) o;
        return new Object[]{dto.id, dto.nome, dto.UF};
    }

    public boolean validaCampos(EstadoDTO estado) {

        if (estado.nome == null || estado.UF.isEmpty()) {
            return false;
        }

        if (estado.UF == null || estado.UF.isEmpty()) {
            return false;
        }
        return true;
    }
}
