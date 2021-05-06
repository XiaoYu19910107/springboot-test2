/*
package com.gyf.web.controller;

import com.gyf.model.User;
import com.gyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//声明Rest风格的控制器
@EnableAutoConfiguration//自动配置，相当于写了spring的配置文件
@RequestMapping("user")
public class UserController {
    @RequestMapping("{id}")
    @ResponseBody
    public User userinfo(@PathVariable() Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        int i = 10/0;
        return  user;
    }

    */
/*public static void main(String[] args) {

        SpringApplication.run(UserController.class,args);

    }*//*


    @Autowired
    private UserService userService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("find")
    @ResponseBody
    public User find(String username){

        return userService.find(username);
    }
}*/
