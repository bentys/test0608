package com.mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlTest {
    public static final String d1="";
    public static final String driver = "com.mysql.jdbc.Driver";
//    public static final String URL = "jdbc:mysql://47.91.223.237:3306/my_db01";
     public static final String URL = "jdbc:mysql://192.168.28.138:3306/xkeshi_test";
     private static final String name="root_xct";
     private static final String PassWord="123456a";
    public static void main(String[] args) throws InterruptedException {

        Connection con = null;
        try
        {
            Class.forName(driver);
        }
        catch(java.lang.ClassNotFoundException e)
        {
            System.out.println("Connect Successfull01.");
            System.out.println("Cant't load Driver");
        }
        try
        {
//      con= DriverManager.getConnection(URL,"root","MyNewPass4!opp");
        con= DriverManager.getConnection(URL,name,PassWord);
            System.out.println("Connect Successfull02.");
        }
        catch(Exception e)
        {
            System.out.println("Connect fail:" + e.getMessage());
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            con.close();
            System.out.println("SQL关闭 Successfull03.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

