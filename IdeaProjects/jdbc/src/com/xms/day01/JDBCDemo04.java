package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author dpc
 * @create 2021-07-09 下午 3:50
 * Statement 的弊端
 */
public class JDBCDemo04 {
    public static void main(String[] args) {

        System.out.println(login("章子怡","qwerty"));
        System.out.println(login("章子怡","123"));

//        sql注入
        System.out.println(login("abc","123' or '1'='1"));

    }

    public static boolean login(String username, String password) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;


        try {
            conn = JDBCUtils.getConnection();
            st = conn.createStatement();
            String sql = "select count(*) from user where name='" + username + "' and password = '" + password+"'";
            System.out.println(sql);
            rs = st.executeQuery(sql);

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count != 0 ) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.releaseScource(conn,st,rs);
        }

        return false;
    }
}
