package org.example.controller;

import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @Autowired
    private UserService userService;

    @RequestMapping(path="index.html",params="act=list")
    @ResponseBody
    public List<User> users(){
        return userService.getUserList();
    }

    //jdbcc测试
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://ip:port/test?user=username&password=password");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from user1 limit 1");
        if(rs.next())
            System.out.println("查询结果为:"+rs.getString("user_name"));
    }
}
