package com.gyf.web.controller;

import com.gyf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("loginname","gyf");
        model.addAttribute("age","23");
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1001,"zhangsan","男",30));
        list.add(new Student(1002,"lisi","男",31));
        list.add(new Student(1003,"wangwu","男",32));
        model.addAttribute("stuList",list);
        return  "stu/list";
    }
}
