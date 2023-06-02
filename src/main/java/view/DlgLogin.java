/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ControllerView;
import control.Functions;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class DlgLogin extends javax.swing.JDialog {
    private ControllerView gerIG;
    /**
     * Creates new form Loginn
     */
    public DlgLogin(java.awt.Frame parent, boolean modal,ControllerView controller) {
        initComponents();
        gerIG = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbSenha = new javax.swing.JLabel();
        pswUsuario = new javax.swing.JPasswordField();
        lbUsuario = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSenha.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha.setText("Senha");
        jPanel1.add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 50));

        pswUsuario.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        pswUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(pswUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 280, 50));

        lbUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbUsuario.setText("CPF");
        jPanel1.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 50));

        btEntrar.setBackground(new java.awt.Color(0, 153, 51));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 110, 50));

        btCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 110, 50));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 280, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/logo (2).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 320));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/telaLogin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean validarCampos(){
        String msgErro = "";
        lbUsuario.setForeground(Color.black);
        lbSenha.setForeground(Color.black);
        
        if(Functions.validarCPF(txtCPF.getText()) == false){
            lbUsuario.setForeground(Color.red);
            msgErro += "CPF Invalido\n";
        }
        if(Functions.validarSenha(String.valueOf(pswUsuario.getPassword())) == false){
            msgErro += "Senha invalida\nVerifique se sua senha possui pelo menos:\n    (8) caracteres;\n    (1) caractere especial;\n    (1) número;\n    (1) letra maiúscula;\n    (1) letra minúscula.\n";
            lbSenha.setForeground(Color.red);
        }

        if(msgErro.isEmpty() && !gerIG.getGerDominio().validarFuncionario(txtCPF.getText(), pswUsuario.getText())){
             msgErro += "Usuário não cadastrado\n";
        }
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos e tente novamente", JOptionPane.ERROR_MESSAGE);
            return false; 
        }
    }
    
    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        if(validarCampos()){
            gerIG.janelaPrincipal();
            this.dispose();
        }

    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void pswUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_pswUsuarioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pswUsuario;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
