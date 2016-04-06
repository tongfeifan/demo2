package com.feifan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tongfeifan on 16/4/6.
 */

@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }

}
