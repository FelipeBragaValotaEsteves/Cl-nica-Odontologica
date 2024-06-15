package dto;

import java.util.LinkedList;
import java.util.List;
import model.Login;

public class LoginDTO extends DTO {

    public String usuario;
    public String senha;
    public FuncionarioDTO funcionario;

    @Override
    public Object builder() {
        Login login = new Login();
        login.setId(id != null ? Long.valueOf(id) : 0l);
        login.setUsuario(usuario);
        login.setSenha(senha);
        login.setFuncionario(funcionario.builder());
        return login;
    }

    public List getListaDados(List<Login> dados) {
        List dadosDTO = new LinkedList();
        for (Login dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Login l) {
        LoginDTO dto = new LoginDTO();
        dto.usuario = l.getUsuario();
        dto.id = l.getId();
        dto.senha = l.getSenha();

        FuncionarioDTO funcDTO = new FuncionarioDTO();
        funcDTO.funcao = l.getFuncionario().getFuncao();
        funcDTO.id = l.getFuncionario().getId();
        funcDTO.login = dto;
        dto.funcionario = funcDTO;
        return dto;
    }

    @Override
    public String toString() {
        return "Login [id=" + id + ", usuario=" + usuario + ", senha=" + senha + "]";
    }
}
