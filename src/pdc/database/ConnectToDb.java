/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sandeep
 */
public class ConnectToDb {

   
    public static void connectDB() {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
           //  String url = "jdbc:sqlite:C:/sqlite3/db/";
            c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite3/db/tests.db");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
     public static void main(String args[]) {
        connectDB();

     }
}
