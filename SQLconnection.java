
import java.sql.Connection;        // note that the order of some of these imports matters
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLconnection {

    public static void main(String[] argv) {
        System.out.println("-------- Simple MySQL Application ------------");

        Tunnel t = new Tunnel();
        try {
            t.go();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try // initialise the JDBC driver, with a check for it working
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered.");
        Connection connection = null;

        try // open the connection to the MySQL server
        {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:9080/w1439058_0", "w1439058", "Sz2eZkchSIXI"); 
//this connetion realy works, if needed change ports 9080 to any avaliable hsould mach "tunnelLocalPort" from Tunnel.java.
                    
                    // "jdbc:mysql://localhost:8889/w1439058_0", "root", "root");
                    //"jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1439058_0",     "w1439058", "Sz2eZkchSIXI");

                    

        } catch (SQLException e) {
            System.out.println("ERROR: MySQL Connection Failed!");
            e.printStackTrace();
            return;
        }
        System.out.println("Database connected!");

        Statement stmt = null;
        try // create a Statement for the SQL query
        {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("ERROR: Failed to create Statement.");
            e.printStackTrace();
            return;
        }

        ResultSet queryRes = null;   // variable to contain the query result
        try // try to run the query
        {
            queryRes = stmt.executeQuery("select * from users");
           // int n = 0;    // a counter for the output

            while (queryRes.next()) // while there's still some more results of the query...
                
                
                
                
            {
                String id = queryRes.getString("userId");
				String firstName = queryRes.getString("userName");
				String lastName = queryRes.getString("userPassword");
                                
                                System.out.println("ID: " + id + ", USER name: " + firstName
						+ ", Password: " + lastName);
                
                
//                int numColumns = queryRes.getMetaData().getColumnCount();   // get how many cols in this entry
//               // n++;
//                // System.out.print("" + n);
//                for (int i = 1; i <= numColumns; i++) // loop through the cols to print them
//                {                                               // Column numbers start at 1.
//                    System.out.print("  " + queryRes.getObject(i));
//                }
//                System.out.println("");   // print a new line at the end of the entry.
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
            e.printStackTrace();
            return;
        }
        try // close the connection now we've finished with it.
        {
            connection.close();
        } catch (SQLException e) {
            System.out.println("WARNING: Failed to close database!");
            e.printStackTrace();
            return;
        }
        System.out.println("Database closed.");
    }
}
