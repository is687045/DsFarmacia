package com.dsfarmacia.cnx;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Nizath on 10/13/2015.
 */
public class Cnx {
	public Connection con;
    public  Cnx(){
        String userName = "user1";
        String password = "dragontear";
        String url = "jdbc:sqlserver://AYUMI\\MSSQLSERVER;databaseName=Dsfarmacia";
        try
        {
            // Load the SQLServerDriver class, build the
            // connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected.");
            // Iterate through the data in the result set and display it.
        }
        catch(Exception e)
        {
            System.exit(0);
        }
    }
}
