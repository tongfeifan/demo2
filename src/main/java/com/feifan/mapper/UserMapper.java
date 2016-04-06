package com.feifan.mapper;

import com.feifan.mybatis.model.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by tongfeifan on 16/4/5.
 */
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectUserByID(int id);

    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectUserByUsername(String username);
}
