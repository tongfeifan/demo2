package com.feifan.services.imple;

import com.feifan.domain.CreateUser;
import com.feifan.mapper.UserMapper;
import com.feifan.model.User;
import com.feifan.services.UserOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by tongfeifan on 16/4/6.
 */

@Service
public class UserOperationImpl implements UserOperation {
    @Autowired
    private UserMapper userMapper;

    public User getUserByUsername(String username) {
        User user = userMapper.selectUserByUsername(username);
        return user;
    }

    public User getUserById(int id) {
        User user = userMapper.selectUserByID(id);
        return user;
    }

    public boolean createUser(CreateUser createUser) {
        userMapper.insertUser(createUser);
        return true;
    }

}
