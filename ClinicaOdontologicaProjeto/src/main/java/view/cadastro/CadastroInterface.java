/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.cadastro;

import dto.DTO;
import javax.swing.JPanel;


public abstract class CadastroInterface extends JPanel {

    public abstract DTO salvar();

    public abstract void preencheCampos(DTO dto);
}
