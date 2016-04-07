package com.feifan.services.imple;

import com.feifan.mybatis.model.User;
import com.feifan.services.Authentication;
import com.feifan.services.UserOperation;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tongfeifan on 16/4/6.
 */
public class AuthenticationImpl implements Authentication {
    @Autowired
    UserOperation userOperation;

    public boolean login(String username, String password) {
        User user = userOperation.getUserByUsername(username);
        return password.equals(user.getPassword());
    }

    public boolean isLogin(String username) {
        return false;
    }
}
