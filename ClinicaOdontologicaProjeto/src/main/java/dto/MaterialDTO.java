package dto;

import java.util.LinkedList;
import java.util.List;
import model.Material;

public class MaterialDTO extends DTO {

    public String nome;
    public Integer qtdMinima;
    public Integer qtdEstoque;

    @Override
    public Object builder() {
        Material material = new Material();
        material.setId(id != null ? Long.valueOf(id) : 0l);
        material.setNome(nome);
        material.setQtdMinima(qtdMinima);
        material.setQtdEstoque(qtdEstoque);

        return material;
    }

    public List getListaDados(List<Material> dados) {
        List dadosDTO = new LinkedList();
        for (Material dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Material m) {
        MaterialDTO dto = new MaterialDTO();
        dto.id = m.getId().toString();
        dto.nome = m.getNome();
        dto.qtdMinima = m.getQtdMinima();

        return dto;
    }
}
