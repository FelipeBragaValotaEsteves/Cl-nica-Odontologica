package controller;

import dto.DTO;
import dto.EnderecoDTO;
import java.util.List;
import model.Endereco;
import persistence.endereco.EnderecoDao;
import persistence.endereco.EnderecoImpl;

public class EnderecoController implements Controller {

    EnderecoDao dao = new EnderecoImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        EnderecoDTO enderecoDTO = (EnderecoDTO) dto;

        if (validaCampos(enderecoDTO)) {
            dao.atualiza(enderecoDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((EnderecoDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Endereco endereco = new Endereco();
        return endereco.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Endereco endereco = new Endereco();
        return endereco.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        EnderecoDTO dto = (EnderecoDTO) o;
        return new Object[]{dto.id, dto.rua, dto.idCidade};
    }

    @Override
    public List getListaDados() {
        List<Endereco> dados = dao.listar(Endereco.class);
        EnderecoDTO enderecoDTO = new EnderecoDTO();
        return enderecoDTO.getListaDados(dados);
    }

    public boolean validaCampos(EnderecoDTO endereco) {

        if (endereco.rua == null || endereco.rua.isEmpty()) {
            return false;
        }
        
         if (endereco.bairro == null || endereco.bairro.isEmpty()) {
            return false;
        }

        if (endereco.idCidade == null) {
            return false;
        }
        return true;
    }
}
