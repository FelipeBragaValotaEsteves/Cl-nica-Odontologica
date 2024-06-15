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
        System.out.println(dados.getClass());
        List dadosDTO = new LinkedList();
        for (Material dado : dados) {
            dadosDTO.add(converte(dado));
        }
        System.out.println(dadosDTO);
        return dadosDTO;
    }

    private Object converte(Material m) {
        System.out.println(m);
        MaterialDTO dto = new MaterialDTO();
        dto.id = m.getId();
        dto.nome = m.getNome();
        dto.qtdMinima = m.getQtdMinima();
        dto.qtdEstoque = m.getQtdEstoque();
        return dto;
    }
}
