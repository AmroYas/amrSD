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
public class Person {

    private String userName;
    private char rank;
    private int userId;

    public Person(String user, char u, int id) {
        userName = user;
        rank = u;
        userId = id;
    }

    public String getUserName() {
        return userName;
    }
    
    public char getUserRank() {
        return rank;
    }
    
    public int getUserId() {
        return userId;
    }
}
