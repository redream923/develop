package com.xms.day02;

import com.xms.day01.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author dpc
 * @create 2021-07-10 上午 9:46
 * 批量插入
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
//        demo1();//25620
        demo2();
//        demo3();//1061
    }

    //    Statement操作
    private static void demo1() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        Statement st = conn.createStatement();
        long t1 =System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String sql = "insert into account(name,money) values('Tom'," +i+")";
            st.execute(sql);
        }
        long t2 =System.currentTimeMillis();
        System.out.println(t2-t1);
    }



    private static void demo2() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into account(name,money) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        long t1 =System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ps.setString(1,"Tom");
            ps.setDouble(2,i);
            ps.executeUpdate(sql);
        }
        long t2 =System.currentTimeMillis();
        System.out.println(t2-t1);
    }


    //    PreparedStatement批处理操作方案
    private static void demo3() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into account(name,money) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        long t1 =System.currentTimeMillis();
//        设置事务不自动提交
        conn.setAutoCommit(false);
        for (int i = 0; i < 10000; i++) {
            ps.setString(1,"Tom");
            ps.setDouble(2,i);
//            将sql添加到批处理命令中(攒sql)
            ps.addBatch();

            if(i%500==0){
//                执行批处理命令
                ps.executeBatch();
//                清空批处理
                ps.clearBatch();
            }
        }

//        提交事务
        conn.commit();


        long t2 =System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
