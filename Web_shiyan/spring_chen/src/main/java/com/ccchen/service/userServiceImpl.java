package com.ccchen.service;

import com.ccchen.service.userService;
import com.ccchen.dao.userDao;
import com.ccchen.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userMapper;

    @Override
    public user login(user uu) {
        return userMapper.getByusernameAndPassword(uu);
    }

    @Override
    public void add(user uu) {
        userMapper.insert(uu);
    }
}
