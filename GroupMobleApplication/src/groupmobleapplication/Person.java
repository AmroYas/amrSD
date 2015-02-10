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
    private String userPassword;
    private Boolean authenticate;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setAuthenticate() {
        authenticate = true;
    }

    public Boolean getAuthenticate() {
        return authenticate;
    }

    public void logIn(String name, String password) {
        //Code
    }

    public void register(String name, String password) {
        //Code
    }
}
