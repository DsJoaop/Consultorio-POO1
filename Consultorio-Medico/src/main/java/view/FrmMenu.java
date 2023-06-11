/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import control.ControllerView;

/**
 *
 * @author joaop
 */
public class FrmMenu extends javax.swing.JFrame {
    private ControllerView gerIG;

    
    public FrmMenu(ControllerView controller) {
        initComponents(); 
        gerIG = controller;
        rbtnEscuro.setSelected(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTema = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btConsultas = new javax.swing.JButton();
        btPacientes = new javax.swing.JButton();
        btMedicos = new javax.swing.JButton();
        btFuncionarios = new javax.swing.JButton();
        btServicos = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiCadastrarPaciente = new javax.swing.JMenuItem();
        jmiCadastrarMedico = new javax.swing.JMenuItem();
        jmiCadastrarFuncionario = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAgendarConsultas = new javax.swing.JMenuItem();
        jmiListarConsultas = new javax.swing.JMenuItem();
        jmiRemarcarEditarConsultas = new javax.swing.JMenuItem();
        jmRelatórios = new javax.swing.JMenu();
        jmiRelatorioConsultas = new javax.swing.JMenuItem();
        jmiRelatorioPacientes = new javax.swing.JMenuItem();
        jmiRelatorioMedicos = new javax.swing.JMenuItem();
        jmiRelatorioFuncionarios = new javax.swing.JMenuItem();
        jmConfiguracoes = new javax.swing.JMenu();
        jmTema = new javax.swing.JMenu();
        rbtnEscuro = new javax.swing.JRadioButtonMenuItem();
        rbtnClaro = new javax.swing.JRadioButtonMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GERENCIADOR DE CONSULTAS");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 0), null, new java.awt.Color(51, 255, 255)));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 51), new java.awt.Color(0, 153, 153), null, new java.awt.Color(102, 102, 102)));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 410));

        btConsultas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/consulta 01 - 32.png"))); // NOI18N
        btConsultas.setMnemonic('c');
        btConsultas.setText("Consultas");
        btConsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultasActionPerformed(evt);
            }
        });

        btPacientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/cliente 01 - 32.png"))); // NOI18N
        btPacientes.setMnemonic('p');
        btPacientes.setText("Pacientes");
        btPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btPacientes.setPreferredSize(new java.awt.Dimension(129, 41));
        btPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacientesActionPerformed(evt);
            }
        });

        btMedicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/Medico 1 - 32.png"))); // NOI18N
        btMedicos.setMnemonic('m');
        btMedicos.setText("Médico");
        btMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btMedicos.setPreferredSize(new java.awt.Dimension(129, 41));
        btMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicosActionPerformed(evt);
            }
        });

        btFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/Funcionario 01 - 32.png"))); // NOI18N
        btFuncionarios.setMnemonic('f');
        btFuncionarios.setText("Funcionários");
        btFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });

        btServicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons8-suporte-32.png"))); // NOI18N
        btServicos.setMnemonic('s');
        btServicos.setText("Servicos");
        btServicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btServicos.setPreferredSize(new java.awt.Dimension(129, 41));
        btServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServicosActionPerformed(evt);
            }
        });

        btRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/relatório01 - 32.png"))); // NOI18N
        btRelatorios.setMnemonic('r');
        btRelatorios.setText("Relatórios");
        btRelatorios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 204, 51), null, new java.awt.Color(102, 255, 204)));
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        jmCadastros.setText("Cadastros");
        jmCadastros.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        jmiCadastrarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadastrarPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/cliente 01 - 16x16.png"))); // NOI18N
        jmiCadastrarPaciente.setText("Paciente");
        jmiCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarPacienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarPaciente);

        jmiCadastrarMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadastrarMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastrarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/Medico 1 - 16x16.png"))); // NOI18N
        jmiCadastrarMedico.setText("Médico");
        jmiCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarMedicoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarMedico);

        jmiCadastrarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/Funcionario 01 - 16x16.png"))); // NOI18N
        jmiCadastrarFuncionario.setText("Funcionário");
        jmiCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarFuncionario);

        menuBar.add(jmCadastros);

        jmConsultas.setText("Consultas");
        jmConsultas.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        jmiAgendarConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAgendarConsultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiAgendarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-consulta-16.png"))); // NOI18N
        jmiAgendarConsultas.setText("Agendar");
        jmiAgendarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgendarConsultasActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiAgendarConsultas);

        jmiListarConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiListarConsultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiListarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-lista-restrita-16.png"))); // NOI18N
        jmiListarConsultas.setText("Listar Consultas");
        jmiListarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarConsultasActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListarConsultas);

        jmiRemarcarEditarConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRemarcarEditarConsultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiRemarcarEditarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/relatorioTrabalho-icon.png"))); // NOI18N
        jmiRemarcarEditarConsultas.setText("Remarcar/Editar");
        jmiRemarcarEditarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRemarcarEditarConsultasActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiRemarcarEditarConsultas);

        menuBar.add(jmConsultas);

        jmRelatórios.setText("Relatórios");
        jmRelatórios.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        jmiRelatorioConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRelatorioConsultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiRelatorioConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/agenda-icon.png"))); // NOI18N
        jmiRelatorioConsultas.setText("Consutas");
        jmRelatórios.add(jmiRelatorioConsultas);

        jmiRelatorioPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRelatorioPacientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiRelatorioPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-fundo-da-conferência-selecionado-16.png"))); // NOI18N
        jmiRelatorioPacientes.setText("Pacientes");
        jmRelatórios.add(jmiRelatorioPacientes);

        jmiRelatorioMedicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRelatorioMedicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiRelatorioMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-médico-16.png"))); // NOI18N
        jmiRelatorioMedicos.setText("Médicos");
        jmRelatórios.add(jmiRelatorioMedicos);

        jmiRelatorioFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRelatorioFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiRelatorioFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/cliente-icon.png"))); // NOI18N
        jmiRelatorioFuncionarios.setText("Funcionário");
        jmRelatórios.add(jmiRelatorioFuncionarios);

        menuBar.add(jmRelatórios);

        jmConfiguracoes.setText("Configurações");
        jmConfiguracoes.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        jmTema.setText("Tema");

        btnGroupTema.add(rbtnEscuro);
        rbtnEscuro.setSelected(true);
        rbtnEscuro.setText("Escuro");
        rbtnEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEscuroActionPerformed(evt);
            }
        });
        jmTema.add(rbtnEscuro);

        btnGroupTema.add(rbtnClaro);
        rbtnClaro.setText("Claro");
        rbtnClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnClaroActionPerformed(evt);
            }
        });
        jmTema.add(rbtnClaro);

        jmConfiguracoes.add(jmTema);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/sair 16x16.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmConfiguracoes.add(jmiSair);

        menuBar.add(jmConfiguracoes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarPacienteActionPerformed
        gerIG.janelaCadPaciente();
    }//GEN-LAST:event_jmiCadastrarPacienteActionPerformed

    private void jmiCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarMedicoActionPerformed
        gerIG.janelaCadMedico();
    }//GEN-LAST:event_jmiCadastrarMedicoActionPerformed

    private void jmiCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarFuncionarioActionPerformed
        gerIG.janelaCadFuncionario();
    }//GEN-LAST:event_jmiCadastrarFuncionarioActionPerformed

    private void jmiAgendarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgendarConsultasActionPerformed
        gerIG.janelaCadConsulta();
    }//GEN-LAST:event_jmiAgendarConsultasActionPerformed

    private void jmiListarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarConsultasActionPerformed
        gerIG.janelaListaConsulta();
    }//GEN-LAST:event_jmiListarConsultasActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        gerIG.janelaLogin();
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void btPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacientesActionPerformed
        gerIG.janelaCadPaciente();
    }//GEN-LAST:event_btPacientesActionPerformed

    private void btServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServicosActionPerformed
        gerIG.janelaCadServico();
    }//GEN-LAST:event_btServicosActionPerformed

    private void btMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicosActionPerformed
        gerIG.janelaCadMedico();
    }//GEN-LAST:event_btMedicosActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        gerIG.janelaCadFuncionario();
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void btConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultasActionPerformed
        gerIG.janelaCadConsulta();
    }//GEN-LAST:event_btConsultasActionPerformed

    private void jmiRemarcarEditarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRemarcarEditarConsultasActionPerformed
        gerIG.janelaCadConsulta();
    }//GEN-LAST:event_jmiRemarcarEditarConsultasActionPerformed

    private void rbtnClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnClaroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatLightLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtnClaroActionPerformed

    private void rbtnEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEscuroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatDarkLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtnEscuroActionPerformed

    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRelatoriosActionPerformed

    
    
    

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultas;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btMedicos;
    private javax.swing.JButton btPacientes;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btServicos;
    private javax.swing.ButtonGroup btnGroupTema;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmConfiguracoes;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmRelatórios;
    private javax.swing.JMenu jmTema;
    private javax.swing.JMenuItem jmiAgendarConsultas;
    private javax.swing.JMenuItem jmiCadastrarFuncionario;
    private javax.swing.JMenuItem jmiCadastrarMedico;
    private javax.swing.JMenuItem jmiCadastrarPaciente;
    private javax.swing.JMenuItem jmiListarConsultas;
    private javax.swing.JMenuItem jmiRelatorioConsultas;
    private javax.swing.JMenuItem jmiRelatorioFuncionarios;
    private javax.swing.JMenuItem jmiRelatorioMedicos;
    private javax.swing.JMenuItem jmiRelatorioPacientes;
    private javax.swing.JMenuItem jmiRemarcarEditarConsultas;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem rbtnClaro;
    private javax.swing.JRadioButtonMenuItem rbtnEscuro;
    // End of variables declaration//GEN-END:variables
}