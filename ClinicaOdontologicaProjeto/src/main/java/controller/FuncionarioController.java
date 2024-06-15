package controller;

import dto.DTO;
import dto.FuncionarioDTO;
import java.util.List;
import model.Funcionario;
import persistence.funcionario.FuncionarioDao;
import persistence.funcionario.FuncionarioImpl;

public class FuncionarioController implements Controller {

    FuncionarioDao dao = new FuncionarioImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        FuncionarioDTO funcionarioDTO = (FuncionarioDTO) dto;

        if (validaCampos(funcionarioDTO)) {
            dao.atualiza(funcionarioDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public String[] getTitulosColunas() {
        Funcionario func = new Funcionario();
        return func.getTitulosColunas();
    }

    public String[] getFiltros() {
        Funcionario func = new Funcionario();
        return func.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        FuncionarioDTO dto = (FuncionarioDTO) o;
        return new Object[]{dto.id, dto.nomeFuncionario, dto.numeroRegistro};
    }

    @Override
    public List getListaDados() {
        List<Funcionario> dados = dao.listar(Funcionario.class);
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((FuncionarioDTO) dto).builder());
    }

    public boolean validaCampos(FuncionarioDTO func) {

        if (func.nomeFuncionario == null || func.nomeFuncionario.isEmpty()) {
            return false;
        }

        if (func.numeroRegistro == null || func.numeroRegistro.isEmpty()) {
            return false;
        }
        
        if (func.login == null) {
            return false;
        }
        
        if (func.funcao == null) {
            return false;
        }
        
        return true;
    }
}
