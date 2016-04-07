package com.feifan.mapper;

import com.feifan.domain.CreateUser;
import com.feifan.model.User;

/**
 * Created by tongfeifan on 16/4/5.
 */


public interface UserMapper {
//    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectUserByID(int id);

//    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectUserByUsername(String username);

    void insertUser(CreateUser createUser);
}
