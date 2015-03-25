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
    private int userId;
    private char[] password;
    private int attemptScore;
    private int attemptNumber;

    SQLConnection myConnection = new SQLConnection();
    ResultSet result;

    public DBManager(String name, char[] pass) {
        userName = name;
        password = pass;
    }

    public DBManager(String name) {
        userName = name;
    }

    public DBManager(int id, int score) {
        userId = id;
        attemptScore = score;
    }

    public DBManager() {

    }

    public Boolean logIn() {
        String logInQuery = "SELECT * FROM users WHERE userName = '" + userName + "'";
        runQuery(logInQuery);
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

    public Boolean register() {
        String strPassword = "";
        for (int i = 0; i < password.length; i++) {
            strPassword += Character.toString(password[i]);
        }
        String registerQuery = "INSERT INTO users (userName, userPassword) VALUES ('" + userName
                + "' , '" + strPassword + "');";
        Arrays.fill(password, '0');
        strPassword = "0";
        boolean success = myConnection.runUpdate(registerQuery);
        return success;
    }

    public Boolean registerAdmin() {
        String strPassword = "";
        for (int i = 0; i < password.length; i++) {
            strPassword += Character.toString(password[i]);
        }
        String registerQuery = "INSERT INTO users (userName, userPassword, userRank) VALUES ('" + userName
                + "' , '" + strPassword + "' , 'a');";
        Arrays.fill(password, '0');
        strPassword = "0";
        boolean success = myConnection.runUpdate(registerQuery);
        return success;
    }

    public void adminReadDB() {
        String selectAll = "SELECT userId, userName, userRank FROM users";
        runQuery(selectAll);
        try { //Try to read the query Result Set
            while (result.next()) // while there's still some more results of the query...
            {
                String userId = result.getString("userId");
                String userName = result.getString("userName");
                String userRank = result.getString("userRank");

                System.out.println("ID: " + userId + ", userName: " + userName
                        + ", Rank: " + userRank);
            }
        } catch (SQLException e) {
            System.out.println("ERROR @adminReadDB: Cannot execute query.");
        }
    }

    public void submitScore() {
        String getAttempt = "SELECT attempt FROM scores WHERE userID = " + userId + ";";
        runQuery(getAttempt);
        try { //Try to read the query Result Set
            result.last(); //Move pointer to end
            attemptNumber = result.getInt("attempt");
            attemptNumber++;
        } catch (SQLException e) {
            attemptNumber = 1;
            System.out.println("ERROR @getAttempt: Cannot execute read query.");
        }
        String scoreQuery = "INSERT INTO scores (attempt, userId, score) VALUES (" + attemptNumber + " , " + userId + " , " + attemptScore + ");";
        myConnection.runUpdate(scoreQuery);
    }

    public String getPassword() {
        String getPassword = "SELECT userPassword FROM users WHERE userName = '" + userName + "';";
        runQuery(getPassword);
        String thePassword = "";
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            thePassword = result.getString("userPassword");
        } catch (SQLException e) {
            System.out.println("ERROR @getPassword: Cannot execute read query.");
        }
        return thePassword;
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

    public Boolean validateName() {
        String validateName = "SELECT * FROM users WHERE userName = '" + userName + "'";
        runQuery(validateName);
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

    public char getUserRank() {
        String personRank = "SELECT userRank FROM users WHERE userName = '" + userName + "'";
        runQuery(personRank);
        char userRank = 'u';
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            userRank = result.getString("userRank").charAt(0);
        } catch (SQLException e) {
            System.out.println("ERROR @getUserRank: Cannot execute read query.");
        }
        return userRank;
    }

    public int getUserId() {
        String personId = "SELECT userId FROM users WHERE userName = '" + userName + "'";
        runQuery(personId);
        int userId = 0;
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            userId = result.getInt("userId");
            System.out.println(userId);
        } catch (SQLException e) {
            System.out.println("ERROR @getUserRank: Cannot execute read query.");
        }
        return userId;
    }

    private void runQuery(String theQuery) {
        myConnection.runQuery(theQuery);
        result = myConnection.getResult();
    }

    public String getUserName() {
        return userName;
    }

    public double getAttemptScore() {
        return attemptScore;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void addAttemptScore(double attemptScore, int attemptNumber) {
        //Code
    }

    //Other SQL Methods
    //Other Admin Methods
}
