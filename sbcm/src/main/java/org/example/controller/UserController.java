package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return userService.findAll().toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public List<String[]> getList(){
        List<String[]> lu = new ArrayList<>();
        lu.add(new String[]{"sh", "上海"});
        lu.add(new String[]{"bj","北京"});
        return lu;
    }
}
