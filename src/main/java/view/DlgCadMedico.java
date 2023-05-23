/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ControllerView;
import control.Functions;
import domain.Medico;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class DlgCadMedico extends javax.swing.JDialog {
    private ControllerView gerIG;
    private Medico medicoSelecionado;
    /**
     * Creates new form DlgCliente
     * @param parent
     * @param modal
     * @param controller
     */
    public DlgCadMedico(java.awt.Frame parent, boolean modal, ControllerView controller) {
        super(parent, modal);
        initComponents();
        gerIG = controller;
        medicoSelecionado = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpTelas = new javax.swing.JTabbedPane();
        CadastroMedico = new javax.swing.JPanel();
        jpDados = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpID = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtIdMedico = new javax.swing.JFormattedTextField();
        jpNome = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jpEmail = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCRM = new javax.swing.JFormattedTextField();
        lbCRM = new javax.swing.JLabel();
        jpCapacidade = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbCPF = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEspecializacao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        cmbEspecializacao = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jpBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        ListarPaciente = new javax.swing.JPanel();
        lbPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btLupa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedicos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jpBotoes1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btListarTodos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar / Listar médicos");
        setMinimumSize(new java.awt.Dimension(612, 509));
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpTelas.setAlignmentX(0.1F);
        jtpTelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jpDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpDados.setPreferredSize(new java.awt.Dimension(570, 130));
        jpDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpID.setLayout(new java.awt.GridLayout(1, 2, -120, 15));
        jpID.setVisible(false);

        lbID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbID.setText("ID");
        jpID.add(lbID);

        txtIdMedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIdMedico.setEnabled(false);
        jpID.add(txtIdMedico);

        jpNome.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbNome.setBackground(new java.awt.Color(255, 255, 255));
        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbNome.setText("Nome");
        jpNome.add(lbNome);
        jpNome.add(txtNome);

        jpEmail.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbEmail.setText("E-mail");
        jpEmail.add(lbEmail);
        jpEmail.add(txtEmail);

        txtCRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbCRM.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCRM.setText("CRM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(jpID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpDados.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 200));

        jpCapacidade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.GridLayout(3, 1, 0, 8));

        lbCPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCPF.setText("CPF");
        jPanel3.add(lbCPF);

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTelefone.setText("Tel. Celular");
        jPanel3.add(lbTelefone);

        lbEspecializacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbEspecializacao.setText("Especialização");
        jPanel3.add(lbEspecializacao);

        jpCapacidade.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 100, 220));

        jPanel4.setLayout(new java.awt.GridLayout(3, 1, 0, 40));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtCPF);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtTelefone);

        cmbEspecializacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anestesiologia", "Cardiologia", "Cirurgia geral", "Dermatologia", "Endocrinologia", "Gastroenterologia", "Geriatria", "Ginecologia", "Hematologia", "Medicina da família e comunidade", "Medicina interna", "Nefrologia", "Neurologia", "Obstetrícia", "Oftalmologia", "Ortopedia", "Otorrinolaringologia", "Pediatria", "Psiquiatria", "Radiologia", "Urologia" }));
        cmbEspecializacao.setSelectedIndex(-1);
        jPanel4.add(cmbEspecializacao);

        jpCapacidade.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 170, 190));

        jpDados.add(jpCapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 320, 220));

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jpBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/confirmar 24x24.png"))); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jpBotoes.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/atualizar 24x24.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jpBotoes.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));
        btAtualizar.setVisible(false);

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-vassoura-24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jpBotoes.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 40));

        javax.swing.GroupLayout CadastroMedicoLayout = new javax.swing.GroupLayout(CadastroMedico);
        CadastroMedico.setLayout(CadastroMedicoLayout);
        CadastroMedicoLayout.setHorizontalGroup(
            CadastroMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroMedicoLayout.createSequentialGroup()
                .addGroup(CadastroMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(CadastroMedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroMedicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CadastroMedicoLayout.setVerticalGroup(
            CadastroMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpTelas.addTab("Cadastrar Médico", CadastroMedico);

        ListarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPesquisar.setText("Pesquisar nome");
        ListarPaciente.add(lbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 40));
        ListarPaciente.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 300, 40));

        btLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lupa24-icon.png"))); // NOI18N
        btLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLupaActionPerformed(evt);
            }
        });
        ListarPaciente.add(btLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPaciente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 610, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Médicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        tbMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "E-MAIL", "TELEFONE", "CRM", "ESPECIALIZACAO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMedicos);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        ListarPaciente.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 590, 190));

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPaciente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 610, 10));

        jpBotoes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/adicionar 24x24.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setPreferredSize(new java.awt.Dimension(75, 23));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jpBotoes1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/editar 24x24.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setPreferredSize(new java.awt.Dimension(75, 23));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jpBotoes1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 40));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lixera 24x24.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jpBotoes1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));

        ListarPaciente.add(jpBotoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 594, 60));

        btListarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-multidão-24.png"))); // NOI18N
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });
        ListarPaciente.add(btListarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 40));

        jtpTelas.addTab("Listar Médico", ListarPaciente);

        getContentPane().add(jtpTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 610, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/TelaMedico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void habilitarBotoes() {
        if(medicoSelecionado == null){
            limparCampos();
            btAtualizar.setVisible(false);
            btConfirmar.setVisible(true);
            jpID.setVisible(false);
        }else{
            limparCampos();
            jtpTelas.setSelectedIndex(0);
            btAtualizar.setVisible(true);
            btConfirmar.setVisible(false);
            jpID.setVisible(false);
        }
    }
    
    private void setCor(){
        lbNome.setForeground(Color.black);
        lbCPF.setForeground(Color.black);
        lbEmail.setForeground(Color.black);
        lbCRM.setForeground(Color.black);
        lbTelefone.setForeground(Color.black);
        lbEspecializacao.setForeground(Color.black);
        txtCRM.setForeground(Color.black);
        lbPesquisar.setForeground(Color.black);
    }
    
    private boolean validarPesquisa(){
        setCor();
        String msgErro = "";
        if(txtPesquisar.getText().isEmpty()){
            lbPesquisar.setForeground(Color.red);
            msgErro += "Insira um nome!\n";
        }
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos e tente novamente", JOptionPane.ERROR_MESSAGE);
            return false; 
        }
    }
    
    
    private boolean validarCampos(){
        String msgErro = "";
        setCor();
        
        
        if(txtNome.getText().isEmpty()){
            msgErro += "Nome invalido\n";
            lbNome.setForeground(Color.red);
        }
        
        if(txtCPF.getText().isEmpty()){
            msgErro += "CPF invalido\n";
            lbCPF.setForeground(Color.red);
        }
        
        if(Functions.validarEmail(txtEmail.getText()) == false){
            msgErro += "Email invalido\n";
            lbEmail.setForeground(Color.red);
        }
        
        if(cmbEspecializacao.getSelectedItem() == null){
            msgErro += "Escolha uma especializacao\n";
            lbEspecializacao.setForeground(Color.red);
        }
        
        if(Functions.validarTelefone(txtTelefone.getText()) == false){
            msgErro += "Telefone ou dd invalido\n";
            lbTelefone.setForeground(Color.red);
        }
        
        if(Functions.validarCPF(txtCPF.getText()) == false){
            lbCPF.setForeground(Color.red);
            msgErro += "CPF Invalido\n";
        }
        
        if(Functions.validarCRM(txtCRM.getText()) == false){
            lbCRM.setForeground(Color.red);
            msgErro += "CRM Invalido\n";
        }
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos e tente novamente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    private void limparCampos(){
        setCor();
        txtIdMedico.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");      
        txtCRM.setText("");
        txtTelefone.setText("");
        cmbEspecializacao.setSelectedIndex(-1);
    }
    
    
    
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed

        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText(); 
        String cpf = txtCPF.getText();
        String crm = txtCRM.getText();
        String especializacao = cmbEspecializacao.getSelectedItem().toString();
        
        
        if(validarCampos()){
            try {
                if(medicoSelecionado == null){
                    int id = gerIG.getGerDominio().inserirMedico(nome, telefone,email, cpf, crm, especializacao);
                    JOptionPane.showMessageDialog(this, "Médico " + id + " inserido com sucesso.", "Inserir Médico", JOptionPane.INFORMATION_MESSAGE  );
                }
            } catch (HeadlessException e) {
               JOptionPane.showMessageDialog(this, e, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            habilitarBotoes();
            formComponentShown(null);
            limparCampos();            
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limparCampos();
        jtpTelas.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int opcao = tbMedicos.getSelectedRow();
        if(opcao >= 0){          
            txtIdMedico.setText(tbMedicos.getValueAt(opcao, 0).toString());
            txtNome.setText(tbMedicos.getValueAt(opcao, 1).toString());
            txtCPF.setText(tbMedicos.getValueAt(opcao, 2).toString());
            txtEmail.setText(tbMedicos.getValueAt(opcao, 3).toString());

            txtCRM.setText(Functions.formatarDataParaInterface(tbMedicos.getValueAt(opcao, 4).toString()));
            txtTelefone.setText(Functions.removerCaracteresTelefone(tbMedicos.getValueAt(opcao, 6).toString()));
           
            btAtualizar.setVisible(true);
            jpID.setVisible(true);
            btConfirmar.setVisible(false);
            
            jtpTelas.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = tbMedicos.getSelectedRow();
        if(opcao >= 0){
            String sexo = "";
             if(tbMedicos.getValueAt(opcao, 5).toString().equals("Masculino")){
                sexo = "Masculino";
            }else{
                sexo = "Feminino";
            }
            if(validarCampos()){
                //remover do banco
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int idPaciente = Integer.parseInt(txtIdMedico.getText());
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText(); 
        String dataNascimento = Functions.formatarDataParaSQL(txtCRM.getText());
        String telefone = txtTelefone.getText();
        
        if(validarCampos()){
            //atualizar no banco
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
        btAtualizar.setVisible(false);
        btConfirmar.setVisible(true);
        jpID.setVisible(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLupaActionPerformed
        if(validarPesquisa()){
            //faz a busca no banco do nome pesquisado
        }
        limparCampos();
    }//GEN-LAST:event_btLupaActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed

        limparCampos();
        //lista todos que estão no banco
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            jtpTelas.setSelectedIndex(1);
            gerIG.carregarTabela(tbMedicos, Medico.class);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar funcionários " + ex.getMessage() );
        }
    }//GEN-LAST:event_formComponentShown

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroMedico;
    private javax.swing.JPanel ListarPaciente;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btLupa;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox<String> cmbEspecializacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBotoes1;
    private javax.swing.JPanel jpCapacidade;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpEmail;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNome;
    private javax.swing.JTabbedPane jtpTelas;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCRM;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEspecializacao;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTable tbMedicos;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCRM;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtIdMedico;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
