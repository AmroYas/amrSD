/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Dennis
 */
public class FormRegister extends javax.swing.JFrame {

    /**
     * Creates new form FormRegister
     */
    public FormRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUserName = new javax.swing.JLabel();
        labelRegister = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelPasswordConfirm = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldConfirm = new javax.swing.JPasswordField();
        textFieldUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserName.setText("Username:");

        labelRegister.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegister.setText("Register");

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword.setText("Password:");

        labelPasswordConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPasswordConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasswordConfirm.setText("Confirm Password:");

        buttonSubmit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldUserName))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPasswordConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(textFieldUserName))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        //Submit Button Code
        String userName = textFieldUserName.getText();
        char[] password = passwordField.getPassword();
        char[] passwordConfirm = passwordFieldConfirm.getPassword();
        boolean confirmed = validatePassword(password, passwordConfirm);
        if (confirmed == true) {
            //DBManager dbm = new DBManager();
        }
        System.out.println(userName);
        System.out.println(confirmed);
    }//GEN-LAST:event_buttonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    private Boolean validateUsername(String username){
        //Code
        return false;
    }
    
    private Boolean validatePassword(char[] password, char[] passwordConfirm) {
        if (!Arrays.equals(password, passwordConfirm)) {
            JOptionPane.showMessageDialog(this,
                    "Passwords don't match.",
                    "Invalid Password",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ((password.length < 5) || (password.length == 0)) {
            JOptionPane.showMessageDialog(this,
                    "Password is less than 5 characters or blank.",
                    "Invalid Password",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordConfirm;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldConfirm;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables
}
