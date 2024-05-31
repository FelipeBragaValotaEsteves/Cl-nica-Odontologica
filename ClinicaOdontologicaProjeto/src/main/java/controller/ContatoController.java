package controller;

import dto.ContatoDTO;
import dto.DTO;
import java.util.List;
import model.Contato;
import persistence.contato.ContatoDao;
import persistence.contato.ContatoImpl;

public class ContatoController implements Controller {

    ContatoDao dao = new ContatoImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        ContatoDTO contatoDTO = (ContatoDTO) dto;

        if (validaCampos(contatoDTO)) {
            dao.atualiza(contatoDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((ContatoDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Contato contato = new Contato();
        return contato.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Contato contato = new Contato();
        return contato.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        ContatoDTO dto = (ContatoDTO) o;
        return new Object[]{dto.id, dto.tipo, dto.idPaciente};
    }

    @Override
    public List getListaDados() {
        List<Contato> dados = dao.listar(Contato.class);
        ContatoDTO contatoDTO = new ContatoDTO();
        return contatoDTO.getListaDados(dados);
    }
    
     public boolean validaCampos(ContatoDTO contato) {

        if (contato.informacao == null || contato.informacao.isEmpty()) {
            return false;
        }

        if (contato.idPaciente == null) {
            return false;
        }
        
        if (contato.tipoContato == null) {
            return false;
        }
        
        if (contato.tipo == null) {
            return false;
        }
       
        return true;
    }
}
