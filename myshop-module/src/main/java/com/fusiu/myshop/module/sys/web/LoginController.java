package com.fusiu.myshop.module.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 登陆控制器
 */
@Controller
public class LoginController {

    /**
     * 以 GET 方式访问登陆页面时候到处理
     * 跳转到登陆页面 用于判断是否已经登陆，真正到登陆逻辑不在此处
     * @return
     */
    @GetMapping(value = {"","login"})
    public String login(){
        //获取 Subject 对象，如果用户存在，就跳转到登陆成功页面，否则就跳转到失败页面

        if (true){
            return "redirect:/index";
        }
        return "modules/sys/login";
    }

    /**
     * 以 POST 访问登陆页面时的跳转
     * 登陆失败到处理，真正到登陆逻辑在 filter 处理
     * @return
     */
    @PostMapping(value = "login")
    public String loginFail(){
        //获取 Subject 对象，如果用户存在，就跳转到登陆成功页面，否则就清空验证信息，然后跳转到登陆页面
        return null;
    }
}
