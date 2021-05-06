package com.gyf.service;


import com.gyf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional//事务注解
public class UserServiceImpl{

    @Autowired
    private UserMapper userMapper;

    public void register(String username, String password) {

        userMapper.save(username,password);

    }
}
