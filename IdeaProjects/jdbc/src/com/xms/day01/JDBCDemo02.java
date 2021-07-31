package com.xms.day01;

import com.xms.day01.util.JDBCUtils;
import sun.applet.Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author dpc
 * @create 2021-07-09 上午 11:25
 * 使用Statement实现CRUD
 */
public class JDBCDemo02 {
    public static void main(String[] args) {
//        updateDemo();

        String sql2 = "select * from user ";
        selectDemo(sql2);
    }

    //  执行查新操作
    private static void selectDemo(String sql) {
        String sql1 = "delete from user where id =1";
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        //        获取连接
        try {
            conn = JDBCUtils.getConnection();
//            创建Statement
            statement = conn.createStatement();
//            执行查询操作,返回结果集
            rs = statement.executeQuery(sql);

//            解析结果集,获取数据
            while (rs.next()) {
//                通过列索引获取列值
                int id = rs.getInt(1);
//                通过列别名获取列值
                String name = rs.getString(2);
                System.out.println(id + "--" + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.releaseScource(conn, statement, rs);
        }

    }

    //    执行增删改操作
    private static void updateDemo() {
        String sql1 = "delete from user where id =1";
        Connection conn = null;
        Statement statement = null;
        try {
//        获取连接
            conn = JDBCUtils.getConnection();
//        创建statement
            statement = conn.createStatement();
//           执行更新操作
            statement.execute(sql1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            释放资源
            JDBCUtils.releaseScource(conn, statement);
        }
    }
}
