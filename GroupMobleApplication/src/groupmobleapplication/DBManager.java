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
public class DBManager {

    private String userName;
    private String userPassword;
    private Boolean userAdmin;
    private Boolean authenticate;
    private double attemptScore;
    private int attemptNumber;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Boolean getUserAdmin() {
        return userAdmin;
    }

    public Boolean getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate() {
        authenticate = true;
    }

    public double getAttemptScore() {
        return attemptScore;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void newEntry(String name, String password) {
        //Code
    }

    public void addAttemptScore(double attemptScore, int attemptNumber) {
        //Code
    }

    //Other SQL Methods
    //Other Admin Methods
}
