package dto;

import model.Endereco;
import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import persistence.cidade.CidadeImpl;

public class EnderecoDTO extends DTO {

    public String rua;
    public String bairro;
    public CidadeDTO cidade;

    @Override
    public Object builder() {
        Endereco endereco = new Endereco();
        endereco.setId(id != null ? Long.valueOf(id) : 0l);
        endereco.setRua(rua);
        CidadeImpl cid = new CidadeImpl();
        endereco.setCidade((Cidade) cidade.builder());
        return endereco;
    }

    public List getListaDados(List<Endereco> dados) {
        List dadosDTO = new LinkedList();
        for (Endereco dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Endereco e) {
        EnderecoDTO dto = new EnderecoDTO();
        dto.id = e.getId();
        dto.rua = e.getRua();
        return dto;
    }
}
