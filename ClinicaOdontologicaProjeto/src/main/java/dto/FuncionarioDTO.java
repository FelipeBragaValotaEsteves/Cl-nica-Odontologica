package dto;

import java.util.LinkedList;
import java.util.List;
import model.Funcionario;

public class FuncionarioDTO extends DTO {

    public String nomeFuncionario;
    public String numeroRegistro;

    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeFuncionario);
        funcionario.setId(id != null ? Long.valueOf(id) : 0l);
        funcionario.setRg(numeroRegistro);
        return funcionario;
    }

    public List getListaDados(List<Funcionario> dados) {
        List dadosDTO = new LinkedList();
        for (Funcionario dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Funcionario f) {
        FuncionarioDTO dto = new FuncionarioDTO();
        dto.nomeFuncionario = f.getNome();
        dto.id = f.getId().toString();
        dto.numeroRegistro = f.getRg();
        return dto;
    }
}
