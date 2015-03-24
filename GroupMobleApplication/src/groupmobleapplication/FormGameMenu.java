/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dennis
 */
public class FormGameMenu extends javax.swing.JFrame {

    private Person person = new Person("default", 'u');

    /**
     * Creates new form FormGameMenu
     */
    public FormGameMenu() {
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

        labelMathsQuiz = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        buttonPlay = new javax.swing.JButton();
        buttonLeaderboard = new javax.swing.JButton();
        buttonAdminCP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMathsQuiz.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelMathsQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMathsQuiz.setText("Maths Quiz");

        labelUserName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonPlay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonPlay.setText("Play");
        buttonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayActionPerformed(evt);
            }
        });

        buttonLeaderboard.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonLeaderboard.setText("Leaderboard");
        buttonLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeaderboardActionPerformed(evt);
            }
        });

        buttonAdminCP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAdminCP.setText("Admin Tools");
        buttonAdminCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMathsQuiz)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLeaderboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(buttonAdminCP, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(labelMathsQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(buttonLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(buttonAdminCP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPerson(Person aPerson) {
        person = aPerson;
    }

    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayActionPerformed
        //Play Button Code
        Object[] possibilities = {"Novice", "Easy", "Medium", "Professional"};
        ImageIcon icon = new ImageIcon();
        String userInput = (String) JOptionPane.showInputDialog(this, "Choose Your Difficulty:\n", "Choose Difficulty", JOptionPane.QUESTION_MESSAGE, icon, possibilities, "Novice");
        int difficulty = 0;
        if (userInput.equals("Novice")) {
            difficulty = 0;
        } else if (userInput.equals("Easy")) {
            difficulty = 1;
        } else if (userInput.equals("Medium")) {
            difficulty = 2;
        } else if (userInput.equals("Professional")) {
            difficulty = 3;
        }
        this.setVisible(false);
        //Play jFrame
        FormPlay formPlay = new FormPlay();
        formPlay.setPerson(person);
        formPlay.setDifficulty(difficulty);
        formPlay.setVisible(true);
    }//GEN-LAST:event_buttonPlayActionPerformed

    private void buttonLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeaderboardActionPerformed
        //LeaderBoard Button Code
        //this.setVisible(false);
        //LeaderBoard jFrame
    }//GEN-LAST:event_buttonLeaderboardActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelUserName.setText(person.getUserName());
        //Hide admin button if user
        if (person.getUserRank() == 'u') {
            buttonAdminCP.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void buttonAdminCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminCPActionPerformed
        //Register jFrame
        FormAdminCP formAdminCP = new FormAdminCP();
        formAdminCP.setVisible(true);
    }//GEN-LAST:event_buttonAdminCPActionPerformed

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
            java.util.logging.Logger.getLogger(FormGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdminCP;
    private javax.swing.JButton buttonLeaderboard;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JLabel labelMathsQuiz;
    private javax.swing.JLabel labelUserName;
    // End of variables declaration//GEN-END:variables
}
