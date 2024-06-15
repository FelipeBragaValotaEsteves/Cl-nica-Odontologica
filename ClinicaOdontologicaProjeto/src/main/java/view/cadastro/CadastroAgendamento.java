/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.cadastro;

import controller.FuncionarioController;
import controller.PacienteController;
import dto.AgendamentoDTO;
import dto.DTO;
import dto.FuncionarioDTO;
import dto.PacienteDTO;
import view.util.Util;

public class CadastroAgendamento extends CadastroInterface{
    
    Util util = new Util();
  
    public CadastroAgendamento() {
        initComponents();
        util.preencheCombo(comboDentista, new FuncionarioController());
        util.preencheCombo(comboPaciente, new PacienteController());
    }

    private AgendamentoDTO dto;
    
    @Override
    public DTO salvar() {
        if (dto == null) {
            dto = new AgendamentoDTO();
        }

        dto.funcionario = (FuncionarioDTO) comboDentista.getSelectedItem();
        dto.paciente = (PacienteDTO) comboPaciente.getSelectedItem();
        dto.data = fieldData.getDate();
        //dto.hora = fieldHora.getDate();

        return dto;
    }

    @Override
    public void preencheCampos(DTO dto) {
        this.dto = (AgendamentoDTO) dto;
        comboDentista.setSelectedItem(this.dto.funcionario);
        comboPaciente.setSelectedItem(this.dto.paciente);
        fieldData.setDate(this.dto.data);
        //fieldHora.setDate(this.dto.hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox<>();
        comboDentista = new javax.swing.JComboBox<>();
        fieldData = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(243, 102, 186));
        setMaximumSize(new java.awt.Dimension(626, 283));
        setMinimumSize(new java.awt.Dimension(626, 283));
        setPreferredSize(new java.awt.Dimension(626, 283));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora");

        fieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHoraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dentista");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(comboDentista, 0, 250, Short.MAX_VALUE)
                    .addComponent(fieldData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldHora)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(comboPaciente, 0, 250, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldHora, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(fieldData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboDentista;
    private javax.swing.JComboBox<String> comboPaciente;
    private com.toedter.calendar.JDateChooser fieldData;
    private javax.swing.JTextField fieldHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
