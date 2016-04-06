package com.feifan.test;

import com.feifan.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.feifan.mapper.UserMapper;

import java.io.Reader;

/**
 * Created by tongfeifan on 16/4/5.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
//    private UserMapper userMapper;

    static {
        try {
            reader = Resources.getResourceAsReader("config/Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public static SqlSessionFactory getSession(){
//        return sqlSessionFactory;
//    }

    public static void main(String[] args){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = (User) session.selectOne("com.feifan.mybatis.models.UserMapper.selectUserByID", 1);
            User user = userMapper.selectUserByID(1);
            System.out.println(user.getUserAddress());
            System.out.println(user.getUserName());
        } finally {
            session.close();
        }
    }
}
