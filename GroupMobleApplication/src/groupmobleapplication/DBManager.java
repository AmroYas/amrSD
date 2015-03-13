/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class DBManager {

    private String userName;
    char[] password;
    private String userPassword;
    private Boolean userAdmin;
    private Boolean authenticate;
    private double attemptScore;
    private int attemptNumber;

    SQLConnection myConnection = new SQLConnection();

    public DBManager(String name, char[] pass) {
        userName = name;
        password = pass;
    }

    public DBManager(String name) {
        userName = name;
    }

    public Boolean logIn() {
        String logInQuery = "SELECT * FROM users WHERE userName = '" + userName + "'";
        myConnection.runQuery(logInQuery);
        ResultSet result;
        result = myConnection.getResult();
        int passwordLength = getPasswordLength(result);
        char[] dbPassword = new char[passwordLength];
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            for (int i = 0; i < passwordLength; i++) {
                char pwChar = result.getString("userPassword").charAt(i);
                dbPassword[i] = pwChar;
            }
        } catch (SQLException e) {
            System.out.println("ERROR @logIn: Cannot execute read query.");
        }
        if (Arrays.equals(password, dbPassword)) {
            System.out.println("Passwords Match");
            Arrays.fill(password, '0');
            Arrays.fill(dbPassword, '0');
            return true;
        }
        return false;
    }

    public int getPasswordLength(ResultSet result) {
        int passwordLength = 0;
        try { //Try to read the query Result Set
            result.first();
            passwordLength = result.getString("userPassword").length();
        } catch (SQLException e) {
            System.out.println("ERROR @getPasswordLength: Cannot execute read query.");
        }
        return passwordLength;
    }

    public Boolean register() {
        String strPassword = "";
        for (int i = 0; i < password.length; i++) {
            strPassword += Character.toString(password[i]);
        }
        String registerQuery = "INSERT INTO users (userName, userPassword) VALUES ('" + userName
                + "' , '" + strPassword + "');";
        strPassword = "0";
        boolean success = myConnection.runUpdate(registerQuery);
        return success;
    }

    public Boolean validateName() {
        String logInQuery = "SELECT * FROM users WHERE userName = '" + userName + "'";
        myConnection.runQuery(logInQuery);
        ResultSet result;
        result = myConnection.getResult();
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            String userLogIn = result.getString("userName");
            if (userLogIn.equals(userName)) {
                return false; //Means Username Exists
            }
        } catch (SQLException e) {
            //If query did not get a result (userName doesn't match any row).
            System.out.println("ERROR @validateName: Cannot execute read query.");
        }
        return true;
    }

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
