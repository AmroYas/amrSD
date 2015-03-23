/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import java.util.Random;

/**
 *
 * @author Dennis
 */
public class FormPlay extends javax.swing.JFrame {

    private Random rand = new Random(); // rand.nextInt((max - min) + 1) + min;

    private int chosenDifficulty = 0;
    private final int numberOfQuestions = 10;
    private Score playerScore = new Score(chosenDifficulty);
    private Question[] questions = new Question[numberOfQuestions];

    /**
     * Creates new form FormPlay
     */
    public FormPlay() {
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
        labelQuestion = new javax.swing.JLabel();
        buttonAnswer1 = new javax.swing.JButton();
        buttonAnswer2 = new javax.swing.JButton();
        buttonAnswer3 = new javax.swing.JButton();
        buttonAnswer4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMathsQuiz.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelMathsQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMathsQuiz.setText("Maths Quiz");

        labelQuestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQuestion.setText("Question");

        buttonAnswer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAnswer1.setText("Answer1");
        buttonAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnswer1ActionPerformed(evt);
            }
        });

        buttonAnswer2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAnswer2.setText("Answer2");
        buttonAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnswer2ActionPerformed(evt);
            }
        });

        buttonAnswer3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAnswer3.setText("Answer3");
        buttonAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnswer3ActionPerformed(evt);
            }
        });

        buttonAnswer4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAnswer4.setText("Answer4");
        buttonAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnswer4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMathsQuiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAnswer3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143))
            .addComponent(labelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelMathsQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(buttonAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(buttonAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAnswer1ActionPerformed

    private void buttonAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAnswer2ActionPerformed

    private void buttonAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnswer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAnswer3ActionPerformed

    private void buttonAnswer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnswer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAnswer4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (int i = 0; i < numberOfQuestions; i++) {
            questions[i] = new Question(chosenDifficulty);
        }

        String theQuestion = "What is " + questions[0].getQuestion() + " ?";
        labelQuestion.setText(theQuestion);

        System.out.println("Answer is " + questions[0].getAnswer());

        int buttonNumber = rand.nextInt((4 - 1) + 1) + 1;
        switch (buttonNumber) {
            case 1:
                buttonAnswer1.setText(questions[0].getAnswer());
                int randAnswer = (Integer.parseInt(questions[0].getAnswer())) + 15;
                buttonAnswer2.setText(Integer.toString(randAnswer));
                randAnswer = (Integer.parseInt(questions[0].getAnswer())) - 15;
                buttonAnswer3.setText(Integer.toString(randAnswer));
                randAnswer = (Integer.parseInt(questions[0].getAnswer())) + 5;
                buttonAnswer4.setText(Integer.toString(randAnswer));
                break;
            case 2:
                int randAnswer2 = (Integer.parseInt(questions[0].getAnswer())) + 15;
                buttonAnswer1.setText(Integer.toString(randAnswer2));
                buttonAnswer2.setText(questions[0].getAnswer());
                randAnswer2 = (Integer.parseInt(questions[0].getAnswer())) - 15;
                buttonAnswer3.setText(Integer.toString(randAnswer2));
                randAnswer2 = (Integer.parseInt(questions[0].getAnswer())) + 5;
                buttonAnswer4.setText(Integer.toString(randAnswer2));
                break;
            case 3:
                int randAnswer3 = (Integer.parseInt(questions[0].getAnswer())) + 15;
                buttonAnswer1.setText(Integer.toString(randAnswer3));
                randAnswer3 = (Integer.parseInt(questions[0].getAnswer())) + 15;
                buttonAnswer2.setText(Integer.toString(randAnswer3));
                buttonAnswer3.setText(questions[0].getAnswer());
                randAnswer3 = (Integer.parseInt(questions[0].getAnswer())) + 5;
                buttonAnswer4.setText(Integer.toString(randAnswer3));
                break;
            case 4:
                int randAnswer4 = (Integer.parseInt(questions[0].getAnswer())) + 15;
                buttonAnswer1.setText(Integer.toString(randAnswer4));
                randAnswer4 = (Integer.parseInt(questions[0].getAnswer())) - 15;
                buttonAnswer2.setText(Integer.toString(randAnswer4));
                randAnswer4 = (Integer.parseInt(questions[0].getAnswer())) - 15;
                buttonAnswer3.setText(Integer.toString(randAnswer4));
                buttonAnswer4.setText(questions[0].getAnswer());
                break;
        }
    }//GEN-LAST:event_formWindowOpened

    public void setDifficulty(int i) {
        chosenDifficulty = i;
    }

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
            java.util.logging.Logger.getLogger(FormPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnswer1;
    private javax.swing.JButton buttonAnswer2;
    private javax.swing.JButton buttonAnswer3;
    private javax.swing.JButton buttonAnswer4;
    private javax.swing.JLabel labelMathsQuiz;
    private javax.swing.JLabel labelQuestion;
    // End of variables declaration//GEN-END:variables
}
