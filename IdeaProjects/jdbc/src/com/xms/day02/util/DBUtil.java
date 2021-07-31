package com.xms.day02.util;

import javax.swing.text.rtf.RTFEditorKit;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author dpc
 * @create 2021-07-10 上午 10:41
 * 支持事务的通用CRUD
 */
public class DBUtil {
    //    通用更新
    public static int update(Connection conn, String sql, Object... objs) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.releaseScource(null, ps);
        }
        return 0;

    }

    public static <T> T queryOne(Connection conn, Class<T> clazz, String sql, Object... objs) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }

            rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            if (rs.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, rs.getObject(i + 1));
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.releaseScource(null, ps, rs);
        }
        return null;
    }

    //    通用查询
    public static <T> ArrayList<T> query(Connection conn, String sql, Class<T> clazz, Object... objs) {
        ArrayList<T> arr = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }
            ResultSet rs = ps.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            while (rs.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < count; i++) {
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Field field = clazz.getField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, rs.getObject(i + 1));
                }
                arr.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arr;
    }
}
