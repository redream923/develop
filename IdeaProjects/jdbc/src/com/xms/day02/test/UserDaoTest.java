package com.xms.day02.test;

import com.xms.day02.Impl.StudentDaoImpl;
import com.xms.day02.Impl.UserDaoImpl;
import com.xms.day02.dao.StudentDao;
import com.xms.day02.dao.UserDao;
import com.xms.day02.domain.Student;
import com.xms.day02.domain.User;
import com.xms.day02.util.JDBCUtils;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:50
 */
public class UserDaoTest {
    UserDao dao = null;
    Connection conn = null;

    @Before
    public void init() {
        dao = new UserDaoImpl();
        try {
            conn = JDBCUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void insertTest() {

        dao.insert(conn, new User(6, "小芳", "12345","sz","110"));
    }

    @Test
    public void getStudentByIdTest() {
        User s = dao.getUserById(conn, 3);
        System.out.println(s);
    }
    @Test
    public void getDeleteById(){
        dao.deleteById(conn,6);
    }
    @Test
    public void getUpdate(){
        dao.update(conn,new User(8,"苍老师","987654321","ss","120"));
    }

    @Test
    public void getAllUsersTest(){
        List<User> allUsers = dao.getAllUsers(conn);
        System.out.println(allUsers);
    }

    @Test
    public void getCountTest(){
        Long count = dao.getCount(conn);
        System.out.println(count);
    }

}
