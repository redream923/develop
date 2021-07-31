package com.xms.day02;

import jdk.internal.util.xml.impl.Input;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author dpc
 * @create 2021-07-10 下午 5:09
 * 通过DBCP获取连接对象
 */
class DBCPUtil{
    static private  DataSource ds;//数据库连接池

    static{
        Properties pro = new Properties();
        InputStream is = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcp.properties");
        try {
            pro.load(is);
//            创建DBCP连接池
            ds = BasicDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}

public class JDBCDemo03 {
    public static void main(String[] args) throws SQLException {
        System.out.println(DBCPUtil.getConnection());
    }
}
