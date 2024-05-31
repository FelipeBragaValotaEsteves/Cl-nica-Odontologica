package dto;

import model.Cidade;
import model.Endereco;
import java.util.LinkedList;
import java.util.List;
import persistence.cidade.CidadeImpl;

public class EnderecoDTO extends DTO {

    public String rua;
    public Long idCidade;

    @Override
    public Object builder() {
        Endereco endereco = new Endereco();
        endereco.setId(id != null ? Long.valueOf(id) : 0l);
        endereco.setRua(rua);
        CidadeImpl cid = new CidadeImpl();
        endereco.setCidade(cid.getCidadeById());
        return endereco;
    }

    public List getListaDados(List<Endereco> dados) {
        List dadosDTO = new LinkedList();
        for (Endereco dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Endereco e) {
        EnderecoDTO dto = new EnderecoDTO();
        dto.id = e.getId().toString();
        dto.rua = e.getRua();
        dto.idCidade = e.getCidade().getId();
        return dto;
    }
}
