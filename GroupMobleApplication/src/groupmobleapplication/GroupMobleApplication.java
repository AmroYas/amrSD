/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import java.util.Arrays;

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

        /*
         System.out.println("Test1");
         SQLConnection test1 = new SQLConnection();
         System.out.println("Test2");
         String testQuery = "SELECT * FROM users"; //Test Query
         //String testQuery = "select * from users"; //Test Query
         test1.runQuery(testQuery);
         System.out.println("Test3");
         test1.readQuery();
         System.out.println("Test4");
         test1.closeConnection();
         System.out.println("Test5");
         */
    }

}
