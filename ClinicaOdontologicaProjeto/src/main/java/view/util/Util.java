package view.util;

import controller.Controller;
import dto.DTO;
import java.util.List;
import javax.swing.JComboBox;

public class Util {

    public void preencheCombo(JComboBox Jcombo, Controller controllerCombo) {
        List<DTO> dados = controllerCombo.getListaDados();

        for (DTO dado : dados) {
            Jcombo.addItem(dado);
        }
    }
}
