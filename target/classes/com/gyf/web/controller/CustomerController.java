package com.gyf.web.controller;


import com.gyf.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//声明Rest风格的控制器
//@EnableAutoConfiguration//自动配置，相当于写了spring的配置文件
@RequestMapping("user")
public class CustomerController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("register")
    @ResponseBody
    public String register(String username, String password) {
        //记录客户端请求参数

        userServiceImpl.register(username, password);
        //customerServiceImpl.register(username, "120");
        return "success";
    }

    @RequestMapping("login")
    public String login(String username, String password) {

        return "user/list";
    }


}