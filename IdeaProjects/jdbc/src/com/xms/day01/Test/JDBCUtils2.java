package com.xms.day01.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author dpc
 * @create 2021-07-10 上午 9:20
 */
public class JDBCUtils2 {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;

    static {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pro = new Properties();
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = pro.getProperty("url");
        user = pro.getProperty("user");
        password = pro.getProperty("password");
        driverClass = pro.getProperty("driverClass");
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driverClass);
        return DriverManager.getConnection(url,user,password);
    }

}
