package dto;

import java.util.LinkedList;
import java.util.List;
import model.Estado;

public class EstadoDTO extends DTO {

    public String nome;
    public String UF;

    @Override
    public Object builder() {
        Estado estado = new Estado();
        estado.setId(id != null ? Long.valueOf(id) : 0l);
        estado.setNome(nome);
        estado.setUF(UF);
        return estado;
    }
    
    public List getListaDados(List<Estado> dados) {
        List dadosDTO = new LinkedList();
        for (Estado dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Estado e) {
        EstadoDTO dto = new EstadoDTO();
        dto.id = e.getId();
        dto.nome = e.getNome();
        dto.UF = e.getUF();
        return dto;
    }
    
    public String toString() {
        return this.UF;
    }
}
