package dto;

import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import model.Estado;
import persistence.estado.EstadoImpl;

public class CidadeDTO extends DTO {

    public String nome;
    public Long idEstado;

    @Override
    public Object builder() {
        Cidade cidade = new Cidade();
        cidade.setId(id != null ? Long.valueOf(id) : 0l);
        cidade.setNome(nome);
        EstadoImpl est = new EstadoImpl();
        cidade.setEstado(est.getEstadoById());
        return cidade;
    }

    public List getListaDados(List<Cidade> dados) {
        List dadosDTO = new LinkedList();
        for (Cidade dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Cidade c) {
        CidadeDTO dto = new CidadeDTO();
        dto.id = c.getId();
        dto.nome = c.getNome();
        dto.idEstado = c.getEstado().getId();
        return dto;
    }

    public String toString() {
        return this.nome;
    }
}
