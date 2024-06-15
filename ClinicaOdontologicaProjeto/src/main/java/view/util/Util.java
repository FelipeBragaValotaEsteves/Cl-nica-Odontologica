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

    public <T extends Enum<T>> void preencheComboEnum(JComboBox comboBox, Class<T> enumClass) {
        T[] values = enumClass.getEnumConstants();

        for (T value : values) {
            comboBox.addItem(value.toString());
        }
    }
}
