package com.feifan.controllers;

import com.feifan.domain.CreateUser;
import com.feifan.services.SMSVerification;
import com.feifan.services.UserOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tongfeifan on 16/4/6.
 */

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    UserOperation userOperation;

    @Autowired
    SMSVerification smsVerification;

    @RequestMapping(method = RequestMethod.GET)
    public String registerPage() {
        return "register";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public String verifyPhoneCode(@ModelAttribute CreateUser createUser) {
        if(!smsVerification.verify(createUser.getUsername(), createUser.getVerifyCode())) {
            return "redirect:/register";
        }
        if (!userOperation.createUser(createUser))
            return "redirect:/register";
        return "redirect:/";
    }

}
