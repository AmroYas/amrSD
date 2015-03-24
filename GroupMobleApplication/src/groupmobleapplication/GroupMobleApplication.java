/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
interface Questions {

    public void generateQuestion();

    public String generateAnswer();

    public String getQuestion();

    public String getAnswer();
}

public class GroupMobleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormMenu form = new FormMenu();
        form.setVisible(true);
    }

}
