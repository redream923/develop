package com.xms.day01;

import com.xms.day01.domain.Account;
import com.xms.day01.domain.Student;
import com.xms.day01.domain.User;
import com.xms.day01.util.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-09 下午 2:09
 * Statement通用的查询操作
 */
public class JDBCDemo03 {
    public static void main(String[] args) {
        JDBCDemo03 jd = new JDBCDemo03();
        String  sql1  = "select * from user ";
        String  sql2  = "select * from account where id = 1";
        String  sql3  = "select * from student where id = 1";
        ArrayList<User> users = jd.findDodify(sql1, User.class);
        for(User u:users){
            System.out.println(u);
        }
/*        Account account = jd.findOne(sql2,Account.class);
        System.out.println(account);
        Student student = jd.findOne(sql3, Student.class);
        System.out.println(student);*/
    }

//    通过指定sql获取1个实例
    public  <T> ArrayList<T> findDodify(String sql, Class<T> clazz){
        Connection conn = null;
        Statement st=null;
        ResultSet rs = null;

//        获取连接
        try {
            conn= JDBCUtils.getConnection();
//            创建statement
            st = conn.createStatement();
//            执行查询,获取结果值
            rs = st.executeQuery(sql);
//            获取属性集的元数据
            ResultSetMetaData metaData = rs.getMetaData();
//            获取结果集列数
            int count = metaData.getColumnCount();
            ArrayList<T> arr=new ArrayList<>();
            while (rs.next()){
//                实例化
                T t = clazz.newInstance();

//                给对象属性赋值
                for(int i=0;i<count ;i++){
//                    获取表中的列名(也为对象的属性名)
//                    String columnName = metaData.getColumnName(i + 1);
//                    获取表中的列名的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
//                    通过反射获取属性
                    Field field = clazz.getDeclaredField(columnLabel);

                    field.setAccessible(true);/*有个方法可以判断属性类型,判断并完善.*/
//                    给属性设值
                    field.set(t,rs.getObject(i+1));

                }
                arr.add(t);
            }
            return arr ;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.releaseScource(conn,st,rs);
        }

        return null;
    }



}
