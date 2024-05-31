package controller;

import dto.DTO;
import dto.PacienteDTO;
import java.util.List;
import model.Paciente;
import persistence.paciente.PacienteDao;
import persistence.paciente.PacienteImpl;

public class PacienteController implements Controller {

    PacienteDao dao = new PacienteImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        PacienteDTO pacienteDTO = (PacienteDTO) dto;

        if (validaCampos(pacienteDTO)) {
            dao.atualiza(pacienteDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((PacienteDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Paciente paciente = new Paciente();
        return paciente.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Paciente paciente = new Paciente();
        return paciente.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        PacienteDTO dto = (PacienteDTO) o;
        return new Object[]{dto.id, dto.nome, dto.cpf, dto.convenio};
    }

    @Override
    public List getListaDados() {
        List<Paciente> dados = dao.listar(Paciente.class);
        PacienteDTO pacienteDTO = new PacienteDTO();
        return pacienteDTO.getListaDados(dados);
    }

    public boolean validaCampos(PacienteDTO paciente) {

        if (paciente.nome == null || paciente.nome.isEmpty()) {
            return false;
        }

        if (paciente.dataNascimento == null || paciente.dataNascimento.toString().isEmpty()) {
            return false;
        }

        if (paciente.convenio == null || paciente.convenio.isEmpty()) {
            return false;
        }

        if (paciente.cpf == null || paciente.cpf.isEmpty()) {
            return false;
        }

        if (paciente.numeroCasa == null || paciente.numeroCasa.toString().isEmpty()) {
            return false;
        }

        return true;
    }
}
