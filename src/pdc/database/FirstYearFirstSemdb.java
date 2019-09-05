/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sandeep
 */
public class FirstYearFirstSemdb {

    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C://sqlite3/db/tests.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE if not exists semester1 (\n"+"halltickect  varchar2(35) PRIMARY KEY NOT NULL,\n"
                    + " Name      varchar2(25)   NOT NULL,\n "
                    + " Branch    varchar2(25)   NOT NULL,\n "
                    + "Groups     varchar2(25)   NOT NULL\n "
                    + " Backlogs   varchar2(50)  NOT NULL\n);";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

}
