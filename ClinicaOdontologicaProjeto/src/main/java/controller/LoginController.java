package controller;

import dto.DTO;
import dto.LoginDTO;
import java.util.List;
import model.Login;
import persistence.login.LoginDao;
import persistence.login.LoginImpl;

public class LoginController implements Controller {

    LoginDao dao = new LoginImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        LoginDTO loginDTO = (LoginDTO) dto;

        if (validaCampos(loginDTO)) {
            dao.atualiza(loginDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((LoginDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Login login = new Login();
        return login.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Login login = new Login();
        return login.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        LoginDTO dto = (LoginDTO) o;
        return new Object[]{dto.id, dto.usuario, dto.funcionario.nomeFuncionario};
    }

    @Override
    public List getListaDados() {
        List<Login> dados = dao.listar(Login.class);
        LoginDTO loginDTO = new LoginDTO();
        return loginDTO.getListaDados(dados);
    }

    public boolean validaCampos(LoginDTO login) {

        if (login.usuario == null || login.id.isEmpty()) {
            return false;
        }

        if (login.usuario == null || login.usuario.isEmpty()) {
            return false;
        }

        return true;
    }
}
