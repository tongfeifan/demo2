package com.feifan.services;

/**
 * Created by tongfeifan on 16/4/6.
 */
public interface Authentication {
    public boolean login(String username, String password);
    public boolean isLogin(String username);
}
