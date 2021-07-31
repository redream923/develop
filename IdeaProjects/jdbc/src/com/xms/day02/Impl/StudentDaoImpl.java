package com.xms.day02.Impl;

import com.xms.day02.dao.BaseDao;
import com.xms.day02.dao.StudentDao;
import com.xms.day02.domain.Student;
import com.xms.day02.util.DBUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:41
 */
public class StudentDaoImpl extends BaseDao<Student> implements StudentDao {




    @Override
    public void insert(Connection conn, Student stu) {
        String sql = "insert into student values(?,?,?)";
        update(conn, sql, stu.getId(), stu.getName(), stu.getAge());
    }

    @Override
    public void deleteById(Connection conn, int id) {
        String sql = "delete from student where id = ?";
        update(conn,sql,id);
    }

    @Override
    public void update(Connection conn, Student stu) {
        String sql = "update student set name = ? where id = ?";
        update(conn,sql,stu.getName(),stu.getId());
    }

    @Override
    public Student getStudentById(Connection conn, int id) {
        String sql = "select * from student where id = ?";
        Student stu = findOne(conn,  sql, id);
        return stu;
    }

    @Override
    public List<Student> getAllStudents(Connection conn) {
        String sql = "select * from student";
        return findMul(conn,sql);
    }

    @Override
    public Long getCount(Connection conn) {
        String sql = "select count(*) from student";
        return findSin(conn,sql);
    }

    @Override
    public int getMaxAge(Connection conn) {
        String sql = "select max(age) from student";
        return findSin(conn,sql);
    }
}
