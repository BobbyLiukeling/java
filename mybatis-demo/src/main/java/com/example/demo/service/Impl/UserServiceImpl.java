package com.example.demo.service.Impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserService;






@Service("userService")
public class UserServiceImpl extends UserService {

    // 注入mapper类
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
