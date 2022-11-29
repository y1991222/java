package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.User;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> findAll();
}
