package controller;

import dto.CidadeDTO;
import dto.DTO;
import java.util.List;
import model.Cidade;
import persistence.cidade.CidadeDao;
import persistence.cidade.CidadeImpl;

public class CidadeController implements Controller {

    CidadeDao dao = new CidadeImpl();

    @Override
    public List getListaDados() {
        List<Cidade> dados = dao.listar(Cidade.class);
        CidadeDTO cidadeDTO = new CidadeDTO();
        return cidadeDTO.getListaDados(dados);
    }

    @Override
    public void salvar(DTO dto) throws Exception {
       CidadeDTO cidadeDTO = (CidadeDTO) dto;

        if (validaCampos(cidadeDTO)) {
            dao.atualiza(cidadeDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
       dao.remove(((CidadeDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
       Cidade cidade = new Cidade();
       return cidade.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Cidade cidade = new Cidade();
        return cidade.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        CidadeDTO dto = (CidadeDTO) o;
        return new Object[]{dto.id, dto.nome};
    }
    
    public boolean validaCampos(CidadeDTO cidade) {

        if (cidade.nome == null || cidade.nome.isEmpty()) {
            return false;
        }

        if (cidade.estado == null) {
            return false;
        }
        return true;
    }
}
