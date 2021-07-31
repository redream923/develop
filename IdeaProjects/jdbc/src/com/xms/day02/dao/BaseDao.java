package com.xms.day02.dao;

import com.xms.day01.util.JDBCUtils;
import com.xms.day02.domain.Student;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author dpc
 * @create 2021-07-10 下午 2:15
 * 定义通用的CRUD
 */
public class BaseDao<T> {
    Class<T> clazz = null;

    //    获取子类继承父类中父类定义的泛型
    {
//    获取当前子类继承的父类(带有泛型)
        Type type = this.getClass().getGenericSuperclass();
//    转成参数化类型
        ParameterizedType parameterizedType = (ParameterizedType) type;
//    获取参数化类型定义的所有泛型
        Type[] types = parameterizedType.getActualTypeArguments();
        clazz = (Class<T>) types[0];
    }

    //    更新
    public int update(Connection conn, String sql, Object... objs) {
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

    //    查询1条记录
    public T findOne(Connection conn, String sql, Object... objs) {
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
                    Field file = clazz.getDeclaredField(columnLabel);
                    file.setAccessible(true);
                    file.set(t, rs.getObject(i + 1));
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


    //    查询多条记录
    public ArrayList<T> findMul(Connection conn, String sql, Object... objs) {
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
            ArrayList<T> list = new ArrayList<>();
            while (rs.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Field file = clazz.getDeclaredField(columnLabel);
                    file.setAccessible(true);
                    file.set(t, rs.getObject(i + 1));
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.releaseScource(null, ps, rs);
        }
        return null;
    }


    //    查询单个值
    public <E> E findSin(Connection conn, String sql, Object... objs) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i+1,objs[i]);
            }
            rs = ps.executeQuery();
            if(rs.next()){
                return (E)rs.getObject(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.releaseScource(null,ps,rs);
        }
        return null;
    }
}
