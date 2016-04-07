package com.feifan.services;

import org.springframework.stereotype.Service;

/**
 * Created by tongfeifan on 16/4/6.
 */

public interface Authentication {
    public boolean login(String username, String password);
    public boolean isLogin(String username);
}
