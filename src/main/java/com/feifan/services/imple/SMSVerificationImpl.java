package com.feifan.services.imple;

import com.feifan.domain.VerifyCode;
import com.feifan.services.SMSVerification;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by tongfeifan on 16/4/7.
 */

@Service
public class SMSVerificationImpl implements SMSVerification {


    public static Map<String, VerifyCode> verifyCodeMap = new HashMap<String, VerifyCode>();

    private String code;

    public void createCode(String username) {
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }

        this.code = code;
        Date date = new Date();

        VerifyCode verifyCode = new VerifyCode(code, date.getTime());
        verifyCodeMap.put(username, verifyCode);
    }

    public boolean sendSMS() {
        System.out.println(this.code);
        return true;

    }

    public boolean sendSMS(String username) {
        VerifyCode verifyCode = verifyCodeMap.get(username);
        String code = verifyCode.getCode();
        System.out.println(code);
        return true;
    }

    public String getCode(String username) {
        VerifyCode verifyCode = verifyCodeMap.get(username);

        return verifyCode.getCode();
    }

    public boolean verify(String username, String receiveCode) {
        VerifyCode verifyCode = verifyCodeMap.get(username);
        return verifyCode.getCode().equals(receiveCode);
    }
}
