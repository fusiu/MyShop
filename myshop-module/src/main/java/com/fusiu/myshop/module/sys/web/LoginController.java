package com.fusiu.myshop.module.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 登陆控制器
 */
@Controller
public class LoginController {

    @GetMapping(value = {"","login"})
    public String login(){
        return "modules/sys/login";
    }
}
