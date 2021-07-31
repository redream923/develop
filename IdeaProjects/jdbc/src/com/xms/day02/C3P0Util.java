package com.xms.day02;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author dpc
 * @create 2021-07-10 下午 5:29
 */
public class C3P0Util {
//    通过默认配置创建数据库连接池
    private static ComboPooledDataSource source = new ComboPooledDataSource();

//    private static ComboPooledDataSource source = new ComboPooledDataSource("otherc3p0");

//    获取连接对象
    public static Connection getConnection() throws SQLException {
        return source.getConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(C3P0Util.getConnection());
    }
}
