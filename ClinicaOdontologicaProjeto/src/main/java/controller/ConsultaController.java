package controller;

import dto.ConsultaDTO;
import dto.DTO;
import java.util.List;
import model.Consulta;
import persistence.consulta.ConsultaDao;
import persistence.consulta.ConsultaImpl;

public class ConsultaController implements Controller {

    ConsultaDao dao = new ConsultaImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        ConsultaDTO funcionarioDTO = (ConsultaDTO) dto;

        if (validaCampos(funcionarioDTO)) {
            dao.atualiza(funcionarioDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((ConsultaDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Consulta consulta = new Consulta();
        return consulta.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Consulta consulta = new Consulta();
        return consulta.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        ConsultaDTO dto = (ConsultaDTO) o;
        return new Object[]{dto.id, dto.funcionario, dto.paciente, dto.valor, dto.formaPagamento};
    }

    @Override
    public List getListaDados() {
        List<Consulta> dados = dao.listar(Consulta.class);
        ConsultaDTO funcionarioDTO = new ConsultaDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    public boolean validaCampos(ConsultaDTO consulta) {

        if (consulta.observacao == null || consulta.observacao.isEmpty()) {
            return false;
        }

        if (consulta.valor == null) {
            return false;
        }

        if (consulta.formaPagamento == null) {
            return false;
        }

        if (consulta.funcionario == null) {
            return false;
        }

        if (consulta.paciente == null) {
            return false;
        }
        return true;
    }

}
