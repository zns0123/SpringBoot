package com.cykj.service.impl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser(User user) {
        List<User> list = userMapper.findUser(user);
        return list;
    }
}
