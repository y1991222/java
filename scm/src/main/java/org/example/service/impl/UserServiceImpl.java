package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getUserList(){
        return userDao.getUserList();
    }
}
