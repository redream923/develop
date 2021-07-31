package com.xms.day02;

import com.xms.day01.util.JDBCUtils;
import com.xms.day02.domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 下午 5:50
 * DBUtils的使用
 */
public class JDBCDemo06 {
    Connection conn;
    QueryRunner runner;

    @Before
    public void init() throws Exception {
        conn = JDBCUtils.getConnection();
        //        创建查询命令器
        runner = new QueryRunner();
    }

    @Test
    public void insertTest() throws SQLException {

        String sql = "insert into student values(?,?,?)";
        runner.update(conn, sql, 5, "xw", 11);
    }

    @Test
    public void deleteTest() throws SQLException {
        String sql = "delete from student where id = ?";
        runner.update(conn, sql, 5);
    }

    @Test
    public void updateTest() throws SQLException {
        String sql = "update student set name = ? where id = ?";
        runner.update(conn,sql,"李四",2);
    }

    @Test
    public void queryOneTest() throws SQLException {
        String sql = "select * from student where id = ?";
        Student stu = runner.query(conn, sql, new BeanHandler<Student>(Student.class), 1);
        System.out.println(stu);
    }

    @Test
    public void queryTest() throws SQLException {
        String sql = "select * from student ";
        List<Student> list = runner.query(conn, sql, new BeanListHandler<>(Student.class));
        System.out.println(list);
    }

    @Test
    public void queryMaxAgeTest() throws SQLException {
        String sql = "select max(age) from student ";
        Integer maxAge = runner.query(conn, sql, new ScalarHandler<>());
        System.out.println(maxAge);
    }
}
