package com.ccchen.controller;

import com.ccchen.pojo.Result;
import com.ccchen.pojo.user;
import com.ccchen.service.userService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@RestController
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/login")
    public Result login(@RequestBody user uu){
        log.info("用户登录：{}",uu);
        user e = userService.login(uu);
        if(e != null) return  Result.success();
        else return  Result.error("用户名或密码错误");
    }

    @PostMapping("/reg")
    public Result add(@RequestBody user uu){
        log.info("用户注册：{}",uu);
        user e =  userService.login(uu);

        if(e != null){
            return Result.error("用户名已存在");
        } else {
            userService.add(uu);
            return Result.success();
        }
    }


}
