package com.feifan.services;


/**
 * Created by tongfeifan on 16/4/7.
 */

public interface SMSVerification {
    void createCode(String username);
    boolean sendSMS(String username);
    boolean sendSMS();
    String getCode(String username);
    boolean verify(String username, String receiveCode);
}
