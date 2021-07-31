package com.xms.day02.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xms.day02.domain.Student;
import com.xms.day02.Impl.StudentDaoImpl;
import com.xms.day02.dao.StudentDao;
import com.xms.day02.util.JDBCUtils;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:50
 */
public class StudentDaoTest {
    StudentDao dao = null;
    Connection conn = null;

    @Before
    public void init() {
        dao = new StudentDaoImpl();
        try {
            conn = JDBCUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void insertTest() {
        dao.insert(conn, new Student(4, "zl", 14));
    }

    @Test
    public void deleteTest() {
        dao.deleteById(conn, 3);
    }

    @Test
    public void updateTest() {
        dao.update(conn, new Student(1, "张三丰", 111));
    }

    @Test
    public void getStudentByIdTest() {
        Student s = dao.getStudentById(conn, 3);
        System.out.println(s);
    }

    @Test
    public void getStudentsTest() {
        List<Student> list = dao.getAllStudents(conn);
        System.out.println(list);
    }

    @Test
    public void getCountTest() {
        Long count = dao.getCount(conn);
        System.out.println(count);
    }

    @Test
    public void getMaxAgeTest() {
        int maxAge = dao.getMaxAge(conn);
        System.out.println(maxAge);
    }
}
