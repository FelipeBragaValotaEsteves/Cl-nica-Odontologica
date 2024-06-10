package view.menu;

import controller.AgendamentoController;
import controller.ConsultaController;
import controller.FuncionarioController;
import controller.MaterialController;
import controller.PacienteController;
import dto.LoginDTO;
import javax.swing.JMenuItem;
import view.cadastro.Cadastro;
import view.cadastro.CadastroAgendamento;
import view.cadastro.CadastroConsulta;
import view.cadastro.CadastroFuncionario;
import view.cadastro.CadastroMaterial;
import view.cadastro.CadastroPaciente;
import view.consulta.Consulta;

/**
 *
 * @author lavota
 */
public class Menu extends javax.swing.JFrame {

    //JMenuItem cadastroAgendamento = new JMenuItem();
    //JMenuItem cadastroConsulta = new JMenuItem();
    //JMenuItem cadastroFuncionario = new JMenuItem();
    //JMenuItem cadastroMaterial = new JMenuItem();
    //JMenuItem cadastroPaciente = new JMenuItem();
    JMenuItem consultaAgendamento = new JMenuItem();
    JMenuItem consultaConsulta = new JMenuItem();
    JMenuItem consultaFuncionario = new JMenuItem();
    JMenuItem consultaMaterial = new JMenuItem();
    JMenuItem consultaPaciente = new JMenuItem();

    public Menu(LoginDTO login) {
        initComponents();
        setTitle("Menu");
        setLocationRelativeTo(null);
        nomeiaMenus();
        labelPerfil.setText(login.usuario);

        menuConsulta.add(consultaAgendamento);
        menuConsulta.add(consultaConsulta);
        menuConsulta.add(consultaFuncionario);
        menuConsulta.add(consultaMaterial);
        menuConsulta.add(consultaPaciente);

        /*switch (login.funcao) {
            case 'DENTISTA':
                menuCadastro
                .add(cadastroAgendamento);
                break;
            case 'RECPCIONISTA':
                
                break;
            case 'GERENTE':
                
                break;
            default:
                throw new AssertionError();
        }*/

 /*cadastroAgendamento.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        cadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        cadastroMaterial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        cadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });*/
        consultaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta telaConsulta = new Consulta(new CadastroAgendamento(), new AgendamentoController());
                telaConsulta.setVisible(true);
            }
        });

        consultaConsulta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta telaConsulta = new Consulta(new CadastroConsulta(), new ConsultaController());
                telaConsulta.setVisible(true);
            }
        });

        consultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta telaConsulta = new Consulta(new CadastroFuncionario(), new FuncionarioController());
                telaConsulta.setVisible(true);
            }
        });

        consultaMaterial.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta telaConsulta = new Consulta(new CadastroMaterial(), new MaterialController());
                telaConsulta.setVisible(true);
            }
        });

        consultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta telaConsulta = new Consulta(new CadastroPaciente(), new PacienteController());
                telaConsulta.setVisible(true);
            }
        });
    }

    private void nomeiaMenus() {
        //cadastroAgendamento.setText("Agendamento");
        //cadastroConsulta.setText("Consulta");
        //cadastroFuncionario.setText("Funcionário");
        //cadastroMaterial.setText("Material");
        //cadastroPaciente.setText("Paciente");

        consultaAgendamento.setText("Agendamento");
        consultaConsulta.setText("Consulta");
        consultaFuncionario.setText("Funcionário");
        consultaMaterial.setText("Material");
        consultaPaciente.setText("Paciente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 32767));
        jLabel6 = new javax.swing.JLabel();
        labelPerfil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuConsulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 102, 186));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(243, 102, 186));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lavota\\Documents\\NetBeansProjects\\ProjetoOdonto\\Clinica-Odontologica\\assets\\Design sem nome.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 186, 88));
        jPanel3.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 137, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lavota\\Documents\\NetBeansProjects\\ProjetoOdonto\\Clinica-Odontologica\\assets\\Design sem nome (1).png")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        labelPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(labelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(243, 102, 186));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(243, 102, 186));
        jPanel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Todos os direitos reservados - © FEFE - 2024");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(273, 273, 273))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(243, 102, 186));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(243, 102, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estamos prontos para trazer todas informações que você busca.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 530, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seja muito bem vindo!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 410, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tenha um ótimo dia!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lavota\\Documents\\NetBeansProjects\\ProjetoOdonto\\Clinica-Odontologica\\assets\\dr hannah.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, -1, 290));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setForeground(new java.awt.Color(243, 102, 186));

        menuCadastro.setText("Cadastro\n");
        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consulta");
        jMenuBar1.add(menuConsulta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelPerfil;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    // End of variables declaration//GEN-END:variables
}
