package com.xms.day01;

import com.mysql.jdbc.Driver;
import com.xms.day01.util.JDBCUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author dpc
 * @create 2021-07-09 上午 10:08
 * 获取数据库连接
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() throws Exception {
        System.out.println(JDBCUtils.getConnection());
    }



    private static void demo02() throws IOException, ClassNotFoundException, SQLException {
//        1)读取jdbc.properties配置信息
//        1.1获取配置文件的输入流
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
//        1.2读取配置文件,加载到属性集中
        Properties pro = new Properties();
        pro.load(is);
//        1.3获取配置文件
        String driverClass = pro.getProperty("driverClass");
        String url = pro.getProperty("url");
        String uer = pro.getProperty("user");
        String password = pro.getProperty("password");
//        2)加载驱动
        Class.forName(driverClass);
//        3)获取连接
        Connection conn = DriverManager.getConnection(url, uer, password);
        System.out.println(conn);
    }

    private static void demo01() throws SQLException {
//        1)加载驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        2)获取连接
        String url = "jdbc:mysql://localhost:3306/myemployees";
        Connection conn = DriverManager.getConnection(url, "root", "1234");
        System.out.println(conn);
    }


}
