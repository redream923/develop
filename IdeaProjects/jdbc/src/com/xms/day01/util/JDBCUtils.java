package com.xms.day01.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author dpc
 * @create 2021-07-09 上午 10:39
 * 自定义JDBC工具类
 */
public class JDBCUtils {
    private static String driverClass;
    private static String url;
    private static String uer;
    private static String password;

    //      资源初始化
    static {
//        1)读取jdbc.properties配置信息
//        1.1获取配置文件的输入流
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
//        1.2读取配置文件,加载到属性集中
        Properties pro = new Properties();
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        1.3获取配置文件
        driverClass = pro.getProperty("driverClass");
        url = pro.getProperty("url");
        uer = pro.getProperty("user");
        password = pro.getProperty("password");
    }

    //    获取连接
    public static Connection getConnection() throws Exception {

//        2)加载驱动
        Class.forName(driverClass);
//        3)获取连接
        return DriverManager.getConnection(url, uer, password);

    }

    //    释放资源
    public static void releaseScource(Connection conn, Statement stat) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void releaseScource(Connection conn, Statement stat, ResultSet rs) {
        releaseScource(conn, stat);
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

