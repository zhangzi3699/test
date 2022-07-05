package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void add(String name, Integer age) {
        //添加信息的操作

        System.out.println("name="+name+",age="+age);
    }
}
