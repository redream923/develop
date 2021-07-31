package com.xms.day02;

import com.xms.day01.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author dpc
 * @create 2021-07-10 上午 10:21
 * 需求:转账业务
 */
public class JDBCDemo02 {
    public static void main(String[] args) {
        updateTx();
    }

    private static void updateTx() {
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        try {
            conn = JDBCUtils.getConnection();

//            1)取消自动提交
            conn.setAutoCommit(false);

            String sql1 = "update account set money = money - 100 where id = 1";
            ps = conn.prepareStatement(sql1);
            ps.executeUpdate();
            
//            System.out.println(1/0);

            String sql2 = "update account set money = money + 100 where id = 2";
            ps2 = conn.prepareStatement(sql2);
            ps2.executeUpdate();
//            2)提交
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
//          回滚
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }finally {
//            设置自动提交
            try {
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            JDBCUtils.releaseScource(conn,ps);
            JDBCUtils.releaseScource(conn,ps2);
        }
    }
}
