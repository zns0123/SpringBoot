package com.cykj.service;

import com.cykj.bean.User;

import java.util.List;

public interface UserService {
    List<User> findUser(User user);
}
