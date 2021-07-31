package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import javax.smartcardio.CommandAPDU;
import java.io.*;
import java.sql.*;

/**
 * @author dpc
 * @create 2021-07-09 下午 5:34
 * PreparedStatement操作Blob
 */
public class JDBCDemo07 {
    public static void main(String[] args) throws Exception {
//        insertBlob();

        queryBlob();
    }
//    插入Blob数据
    public static void insertBlob() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into customers  values (?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setObject(1,19);
        ps.setObject(2,"张三");
        ps.setObject(3,"za@qq.com");
        ps.setObject(4,"1986-06-13");
        FileInputStream is = new FileInputStream("img\\1.jpg");
        ps.setObject(5,is);

        ps.executeUpdate();

        JDBCUtils.releaseScource(conn,ps);
    }
//    查询Blob数据
    public static void queryBlob() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from customers where id =?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1,19);

        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            Date birth = rs.getDate("birth");
            System.out.println(id+"-" +email+"-"+birth);

//            获取Blob数据
            Blob phone = rs.getBlob("photo");
//            下载Blob数据
            InputStream is = phone.getBinaryStream();
            OutputStream os = new FileOutputStream("img\\1c.jpg");
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf))!=-1){
                os.write(buf,0,len);
            }
            os.close();
            is.close();
            JDBCUtils.releaseScource(conn,ps,rs);
        }
    }

}
