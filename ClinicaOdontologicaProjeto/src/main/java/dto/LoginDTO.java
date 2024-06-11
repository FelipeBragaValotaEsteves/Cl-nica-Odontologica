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
        FuncionarioDTO funcDto = new FuncionarioDTO();
        dto.funcionario = (FuncionarioDTO) funcDto.converte(l.getFuncionario());
        return dto;
    }
}
