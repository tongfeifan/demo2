package com.feifan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by tongfeifan on 16/4/5.
 */


@Controller
@RequestMapping("/demo")
public class HomeController {

    @RequestMapping("/")
    public String showTestPage(Map<String, Object> model){
        return "index";
    }

}
