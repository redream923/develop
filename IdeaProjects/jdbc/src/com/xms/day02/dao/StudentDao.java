package com.xms.day02.dao;

import com.xms.day02.domain.Student;

import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:32
 * 针对Student表的CRUD操作
 */
public interface StudentDao {

    void insert(Connection conn, Student stu);

    void deleteById(Connection conn, int id);

    void update(Connection conn, Student stu);

    com.xms.day02.domain.Student getStudentById(Connection conn, int id);

    List<com.xms.day02.domain.Student> getAllStudents(Connection conn);

    Long getCount(Connection conn);

    int getMaxAge(Connection conn);


}
