package com.feifan.services.imple;

import com.feifan.mapper.UserMapper;
import com.feifan.mybatis.model.User;
import com.feifan.services.UserOperation;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by tongfeifan on 16/4/6.
 */
public class UserOperationImpl implements UserOperation {
    @Autowired
    UserMapper userMapper;

    public User getUserByUsername(String username) {
        User user = userMapper.selectUserByUsername(username);
        return user;
    }

    public User getUserById(int id) {
        User user = userMapper.selectUserByID(id);
        return user;
    }

    public boolean createUser(String username, String password, int phoneNumber) {
        return false;
    }
}
