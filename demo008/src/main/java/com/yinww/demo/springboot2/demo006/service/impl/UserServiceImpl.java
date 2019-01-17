package com.yinww.demo.springboot2.demo006.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yinww.demo.springboot2.demo006.domain.User;
import com.yinww.demo.springboot2.demo006.mapper.UserMapper;
import com.yinww.demo.springboot2.demo006.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

}
