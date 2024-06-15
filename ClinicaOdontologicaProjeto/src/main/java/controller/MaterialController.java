package controller;

import dto.DTO;
import dto.MaterialDTO;
import java.util.List;
import model.Material;
import persistence.material.MaterialDao;
import persistence.material.MaterialImpl ;

public class MaterialController implements Controller {

    MaterialDao dao = new MaterialImpl();

    @Override
    public void salvar(DTO dto) throws Exception {
        MaterialDTO materialDTO = (MaterialDTO) dto;

        if (validaCampos(materialDTO)) {
            dao.atualiza(materialDTO.builder());
        } else {
            throw new Exception("Preencha todos os campos obrigatórios (*)!");
        }
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((MaterialDTO) dto).builder());
    }

    @Override
    public String[] getTitulosColunas() {
        Material func = new Material();
        return func.getTitulosColunas();
    }

    @Override
    public String[] getFiltros() {
        Material func = new Material();
        return func.getFiltros();
    }

    @Override
    public Object[] getDados(DTO o) {
        MaterialDTO dto = (MaterialDTO) o;
        return new Object[]{dto.id, dto.nome, dto.qtdMinima, dto.qtdEstoque};
    }

    @Override
    public List getListaDados() {
        List<Material> dados = dao.listar(Material.class);
        System.out.println(dados);
        MaterialDTO materialDTO = new MaterialDTO();
        return materialDTO.getListaDados(dados);
    }

    public boolean validaCampos(MaterialDTO material) {

        if (material.nome == null || material.nome.isEmpty()) {
            return false;
        }

        if (material.qtdEstoque == null) {
            return false;
        }

        if (material.qtdMinima == null) {
            return false;
        }

        return true;
    }

}
