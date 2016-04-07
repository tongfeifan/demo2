package com.feifan.controllers;

import com.feifan.services.Authentication;
import com.feifan.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tongfeifan on 16/4/5.
 */


@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private Authentication authentication;

    @RequestMapping(method = RequestMethod.GET)
    public String showLoginPage(){

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute User user){
        if (authentication.login(user.getUsername(), user.getPassword())){
            return "redirect:/index";
        }
        else
            return "login";
    }
}
