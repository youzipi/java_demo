package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * project_name:java_demo
 * package_name:com.jdbc
 * user: youzipi
 * date: 2014/9/29
 */
public class GetConn {
    static String url = "jdbc:mysql://localhost:3306/imagenews";
    static String username = "root";
    static String password = "123456";
    //static String charset = "utf8";

    public Connection conn = null;

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(conn == null){
                conn = DriverManager.getConnection(url, username, password);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        //System.out.println("Connected...");
        return conn;
    }
}
