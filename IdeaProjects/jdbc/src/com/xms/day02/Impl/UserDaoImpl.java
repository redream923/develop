package com.xms.day02.Impl;

import com.xms.day02.dao.BaseDao;
import com.xms.day02.dao.UserDao;
import com.xms.day02.domain.Student;
import com.xms.day02.domain.User;

import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:41
 */
public class UserDaoImpl extends BaseDao<User> implements UserDao {

    @Override
    public void insert(Connection conn, User user) {
        String sql = "insert into user(name,password,address,phone) values(?,?,?,?)";
        update(conn, sql, user.getName(), user.getAddress(), user.getAddress(), user.getPhone());
    }

    @Override
    public void deleteById(Connection conn, int id) {
        String sql = "delete from user where id = ?";
        update(conn,sql,id);
    }

    @Override
    public void update(Connection conn, User user) {
        String sql = "update user set name = ? where id = ?";
        update(conn,sql,user.getName(),user.getId());
    }

    @Override
    public User getUserById(Connection conn, int id) {
        String sql = "select id, name ,password address ,phone from user where id =?";
        return findOne(conn, sql, id);
    }

    @Override
    public List<User> getAllUsers(Connection conn) {
        String sql = "select * from user";
        return findMul(conn,sql);
    }

    @Override
    public Long getCount(Connection conn) {
        String sql = "select count(*) from user";
        return findSin(conn,sql);
    }
}
