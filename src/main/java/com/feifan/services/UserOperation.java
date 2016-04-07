package com.feifan.services;

import com.feifan.domain.CreateUser;
import com.feifan.model.User;

/**
 * Created by tongfeifan on 16/4/6.
 */

public interface UserOperation {
    User getUserByUsername(String username);
    User getUserById(int id);
    boolean createUser(CreateUser createUser);
}
