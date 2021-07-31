package com.xms.day01;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.xms.day01.domain.User;
import com.xms.day01.util.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 * @author dpc
 * @create 2021-07-09 下午 4:22
 * PreparedStatement操作CRUD的通用方法
 */
public class JDBCDemo06 {
    public static void main(String[] args) throws Exception {
/*        String sql = "insert into account values(?,?,?) ";
        update(sql, 1,"张三丰" ,2000);*/
/*        String sql2 = "select * from user where name=?";
        User user = query(sql2, User.class, "章子怡");
        System.out.println(user);*/
        String sql2 = "select * from user ";
        ArrayList<User> user = querys(sql2, User.class);
        for(User u :user)
        System.out.println(u);
    }

    /**
     *
     * @param :更新通用方法
     * @param objs:占位符值
     * @throws Exception
     */

    //    更新
    public static void update(String sql ,Object... objs) throws Exception {

        Connection conn = JDBCUtils.getConnection();
//        获取PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
//        填充占位符
        for(int i=0;i<objs.length;i++){
            ps.setObject(i+1,objs[i]);
        }
//        执行更新操作
        int line = ps.executeUpdate();
        if (line > 0) {
            System.out.println("更新成功,受影响的行数为" + line);
        } else {
            System.out.println("更新失败");
        }
        JDBCUtils.releaseScource(conn, ps);
    }

    //    查询
    public static <T>  T   query(String sql ,Class<T> clazz, Object... objs) throws Exception {
        Connection conn = JDBCUtils.getConnection();
//        获取PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
//        填充占位符
        for (int i=0;i<objs.length;i++){
            ps.setObject(i+1,objs[i]);
        }
//        执行查询
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();//列数
//        解析结果集
        if (rs.next()) {
//            实例化
            T t =clazz.newInstance();
//          t对象属相设置
            for(int i =0;i<count ;i++){
                String columnLabel = metaData.getColumnLabel(i + 1);
                Field field = clazz.getDeclaredField(columnLabel);
                field.setAccessible(true);
                field.set(t,rs.getObject(i+1));
            }
            return t;
        }

//        释放资源
        JDBCUtils.releaseScource(conn, ps, rs);
        return null;
    }


    public static <T> ArrayList<T>   querys(String sql , Class<T> clazz, Object... objs) throws Exception {
        ArrayList<T> arr =new ArrayList<>();
        Connection conn = JDBCUtils.getConnection();
//        获取PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
//        填充占位符
        for (int i=0;i<objs.length;i++){
            ps.setObject(i+1,objs[i]);
        }
//        执行查询
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();//列数
//        解析结果集
        while (rs.next()) {
//            实例化
            T t =clazz.newInstance();
//          t对象属相设置
            for(int i =0;i<count ;i++){
                String columnLabel = metaData.getColumnLabel(i + 1);
                Field field = clazz.getDeclaredField(columnLabel);
                field.setAccessible(true);
                field.set(t,rs.getObject(i+1));
            }
            arr.add(t);
        }
//        释放资源
        JDBCUtils.releaseScource(conn, ps, rs);
        return arr;

    }
}
