package com.xms.day02.dao;

import com.xms.day02.domain.User;

import java.sql.Connection;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-10 上午 11:32
 * 针对
 */
public interface UserDao {
    void insert(Connection conn, User user);

    void deleteById(Connection conn, int id);

    void update(Connection conn, User user);

    User getUserById(Connection conn, int id);

    List<User> getAllUsers(Connection conn);

    Long getCount(Connection conn);

}
