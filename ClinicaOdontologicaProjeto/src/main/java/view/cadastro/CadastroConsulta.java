package view.cadastro;

import controller.FuncionarioController;
import controller.PacienteController;
import controller.ProntuarioController;
import dto.ConsultaDTO;
import dto.DTO;
import dto.FuncionarioDTO;
import dto.PacienteDTO;
import model.FormaPagamento;
import view.util.Util;

public class CadastroConsulta extends CadastroInterface {

    Util util = new Util();

    public CadastroConsulta() {
        initComponents();
        util.preencheCombo(comboDentista, new FuncionarioController());
        util.preencheCombo(comboPaciente, new PacienteController());
        //util.preencheCombo(comboPagamento, new FormaPagamentoController());
        util.preencheCombo(comboProntuario, new ProntuarioController());
    }

    private ConsultaDTO dto;

    @Override
    public DTO salvar() {
        if (dto == null) {
            dto = new ConsultaDTO();
        }

        dto.funcionario = (FuncionarioDTO) comboDentista.getSelectedItem();
        dto.paciente = (PacienteDTO) comboPaciente.getSelectedItem();
        dto.formaPagamento = (FormaPagamento) comboPagamento.getSelectedItem();
        //dto.registroConsulta. = (PacienteDTO) comboProntuario.getSelectedItem();
        dto.registroConsulta.descricao = fieldDesc.getText();
        dto.observacao = fieldObs.getText();
        dto.valor = Float.parseFloat(fieldValor.getText());

        return dto;
    }

    @Override
    public void preencheCampos(DTO dto) {
        this.dto = (ConsultaDTO) dto;
        comboDentista.setSelectedItem(this.dto.funcionario);
        comboPaciente.setSelectedItem(this.dto.paciente);
        comboPagamento.setSelectedItem(this.dto.formaPagamento);
        //comboProntuario.setSelectedItem(this.dto.registroConsulta.);
        fieldDesc.setText(this.dto.registroConsulta.descricao);
        fieldObs.setText(this.dto.observacao);
        fieldValor.setText(Float.toString(this.dto.valor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboDentista = new javax.swing.JComboBox<>();
        comboPagamento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox<>();
        fieldValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldObs = new javax.swing.JTextField();
        fieldDesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboProntuario = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(243, 102, 186));
        setMaximumSize(new java.awt.Dimension(626, 283));
        setMinimumSize(new java.awt.Dimension(626, 283));
        setPreferredSize(new java.awt.Dimension(626, 283));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Paciente");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dentista");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Forma de Pagamento");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prontuário");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Observações");

        fieldObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldObsActionPerformed(evt);
            }
        });

        fieldDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldObs, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(comboDentista, 0, 250, Short.MAX_VALUE)
                                    .addComponent(comboPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(comboProntuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(comboPaciente, 0, 250, Short.MAX_VALUE)
                                        .addComponent(fieldValor)
                                        .addComponent(fieldDesc)))))
                        .addGap(35, 35, 35))))
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
                    .addComponent(comboDentista, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldValor)
                    .addComponent(comboPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboProntuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldObsActionPerformed

    private void fieldDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboDentista;
    private javax.swing.JComboBox<String> comboPaciente;
    private javax.swing.JComboBox<String> comboPagamento;
    private javax.swing.JComboBox<String> comboProntuario;
    private javax.swing.JTextField fieldDesc;
    private javax.swing.JTextField fieldObs;
    private javax.swing.JTextField fieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
