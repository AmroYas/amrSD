/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

//Note that the order of some of these imports matters
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class SQLConnection {

    //Enable tunnel if you are connecting from home or any other network outside UNI or disable it if you are at UNI
    //**************************************************************************************************************
    Tunnel t = new Tunnel();
    Connection connection = null;
    ResultSet queryRes = null;   //Variable to contain the query result

    public SQLConnection() {
        System.out.println("-------- Simple MySQL Connection ------------");
        startConnection();
        //runQuery();
        //closeConnection();
    }

    public void startConnection() {
        //Enable tunnel if you are connecting from home or any other network outside UNI or disable it if you are at UNI
        //**************************************************************************************************************
        //TUNNEL
        try {
            t.connection();
        } catch (Exception ex) {
            System.out.println("Exception in Tunnel");
        }

        try { //Initialise the JDBC driver, with a check for it working
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered.");

        try // open the connection to the MySQL server
        {
            //Connection address below works only from UNI and it does not require tunneling. 
            //Make sure you disable tunnel above too.
            //**************************************************************************************************************
            connection = DriverManager.getConnection(
                    //Connection address below works ony if you are running program from home or eny other network INSIDE UNI
                    //**************************************************************************************************************
                  // "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1439058_0", "w1439058", "Sz2eZkchSIXI");

                    //Connection address below works ony if you are running program from home or eny other network OUTSIDE UNI
                    //**************************************************************************************************************
                  "jdbc:mysql://localhost:9080/w1439058_0", "w1439058", "Sz2eZkchSIXI");
        } catch (SQLException e) {
            System.out.println("ERROR: MySQL Connection Failed!");
            return;
        }
        System.out.println("Database Connected!");
    }

    public void closeConnection() {
        try { //Close the connection now we've finished with it.
            connection.close();
        } catch (SQLException e) {
            System.out.println("WARNING: Failed to close database!");
            return;
        }
        System.out.println("Database closed.");
    }

    public void runQuery(String aQuery) {
        Statement stmt = null;
        try //Create a Statement for the SQL query
        {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("ERROR: Failed to create Statement.");
        }

        try { //Try to run the query
            queryRes = stmt.executeQuery(aQuery);
            System.out.println("Query Successful");
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
        }
    }

    public boolean runUpdate(String aQuery) {
        Statement stmt = null;
        try { //Create a Statement for the SQL query
            stmt = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("ERROR: Failed to create Statement.");
            return false;
        }

        try { //Try to run the query
            stmt.executeUpdate(aQuery);
            System.out.println("Insert Successful");
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
            return false;
        }
        return true;
    }

    public void readResult(String aColumn) {
        try { //Try to read the query
            while (queryRes.next()) // while there's still some more results of the query...
            {
                String result = queryRes.getString(aColumn);
                System.out.println(aColumn + " " + result);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
        }
    }

    public ResultSet getResult() {
        return queryRes;
    }
}
