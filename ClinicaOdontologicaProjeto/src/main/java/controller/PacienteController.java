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
        System.out.println(dto);

        PacienteDTO pacienteDTO = (PacienteDTO) dto;
        System.out.println(pacienteDTO);

        if (validaCampos(pacienteDTO)) {
            System.out.println(pacienteDTO.builder());
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
        return new Object[]{dto.id, dto.nome, dto.cpf, dto.convenio, dto.dataNascimento};
    }

    @Override
    public List getListaDados() {
        List<Paciente> dados = dao.listar(Paciente.class);
        System.out.println(dados);
        PacienteDTO pacienteDTO = new PacienteDTO();
        return pacienteDTO.getListaDados(dados);
    }

    public boolean validaCampos(PacienteDTO paciente) {

        if (paciente.nome == null) {
            return false;
        }

        if (paciente.dataNascimento == null) {
            return false;
        }

        if (paciente.cpf == null) {
            return false;
        }

        if (paciente.endereco == null) {
            return false;
        }

        if (paciente.numeroCasa == null) {
            return false;
        }

        return true;
    }
}
