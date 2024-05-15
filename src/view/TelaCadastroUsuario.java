
package view;

import Model.Usuario;
import Model.Usuario;
import ModelDAO.UsuarioDAO;
import ModelDAO.UsuarioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame { 

    Usuario usuario = new Usuario(); 

    UsuarioDAO usuariodao = new UsuarioDAO(); 

    public TelaCadastroUsuario() { 

        initComponents(); 

    } 

   @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtSenha1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Usuarios");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 368, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 269, 60, -1));

        btnSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 204, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 453, 100, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 292, 190, -1));
        getContentPane().add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 292, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel9.setText("Matrícula:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 337, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 368, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Usuário");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 136, 843, 46));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagem3.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel11.setText("Nome:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 269, 60, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastro 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        btnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 0, 0));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 453, 100, -1));

        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 225, 17, 17));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Branco.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 850, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
       try {
            Salvar_Dados();
        } catch(Exception ex) {
          
        }
    }                                         
    private boolean validaCamposObrigatorios() {
    return (txtNome.getText().equals("")
            || txtEmail.getText().equals("")
            || txtSenha1.getText().equals("")
            || txtMat.getText().equals(""));
    }                                       
    private void Salvar_Dados() throws Exception{
        if(validaCamposObrigatorios()) {

    JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de salvar!!");
} else {
    try {
        
        usuario.setSenha(txtSenha1.getText()); 
        usuario.setEmail(txtEmail.getText());
        usuario.setMatricula(txtMat.getText());
        usuario.setNome(txtNome.getText());
         // Adicionando a senha
        
        usuariodao.adicionar(usuario); 
        
        // Limpe os campos de texto após a atualização
        txtMat.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha1.setText(""); // Limpando o campo de senha

        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
    
     
        TelaLogin tc = new TelaLogin();
                this.dispose();
                tc.setVisible(true);
    
    
    
    } catch (SQLException e) {
      
        
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + e.toString());
    }


}
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        try {
            Salvar_Dados();
        } catch (Exception ex) {
        }
         
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
         dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha1;
    // End of variables declaration//GEN-END:variables

    private static class usuario extends Usuario {

        public usuario() {
        }
    }
    }
    
  
