package com.feifan.controllers;

import com.feifan.domain.ReturnMsg;
import com.feifan.domain.VerifyCode;
import com.feifan.domain.WaitVerifyUser;
import com.feifan.model.User;
import com.feifan.services.SMSVerification;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tongfeifan on 16/4/7.
 */

@RestController
public class SMSController {

    @Autowired
    SMSVerification smsVerification;

    @RequestMapping(value = "/api/send-sms", method = RequestMethod.POST)
    public @ResponseBody ReturnMsg sendSMS(@ModelAttribute WaitVerifyUser waitVerifyUser) {
        //创建code
        smsVerification.createCode(waitVerifyUser.getUsername());

        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.setSuccess(smsVerification.sendSMS());

        if (!returnMsg.isSuccess()){
            returnMsg.setMessage("出错了");
        }
        return returnMsg;
    }
}
