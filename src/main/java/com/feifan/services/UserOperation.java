package com.feifan.services;

import com.feifan.mybatis.model.User;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.Reader;

/**
 * Created by tongfeifan on 16/4/6.
 */
public interface UserOperation {
    User getUserByUsername(String username);
    User getUserById(int id);
    boolean createUser(String username, String password, int phoneNumber);
}
