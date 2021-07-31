package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import javax.naming.Name;
import javax.sound.sampled.Line;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author dpc
 * @create 2021-07-09 下午 4:22
 * PreparedStatement操作CRUD
 */
public class JDBCDemo05 {
    public static void main(String[] args) throws Exception {
//        update(3, "张无忌", 2000);
        query(3);
    }

    //    更新
    public static void update(int id, String name, double money) throws Exception {
//        ?是占位符,表示这里有一个数据
        String sql = "insert into account values(?,?,?)";
        Connection conn = JDBCUtils.getConnection();
//        获取PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
//        填充占位符
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, money);
//        执行更新操作
        int line = ps.executeUpdate();
        if (line > 0) {
            System.out.println("插入成功,一共插入了" + line + "行数据");
        } else {
            System.out.println("插入失败");
        }
        JDBCUtils.releaseScource(conn, ps);
    }

    //    查询
    public static void query(int id) throws Exception {
        String sql = "select * from account where id =?";
        Connection conn = JDBCUtils.getConnection();
//        获取PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
//        填充占位符
        ps.setInt(1, id);
//        执行查询
        ResultSet rs = ps.executeQuery();
//        解析结果集
        if (rs.next()) {
            int aid = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(aid + "--" + name + "--" + money);
        }

//        释放资源
        JDBCUtils.releaseScource(conn, ps, rs);
    }
}
