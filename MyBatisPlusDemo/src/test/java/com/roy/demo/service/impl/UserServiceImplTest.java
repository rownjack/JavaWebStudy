package com.roy.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.roy.demo.service.UserService;
import org.junit.runner.RunWith;
import com.roy.demo.pojo.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    public void getOne(){
        User one = userService.getOne(Wrappers.<User>lambdaQuery().gt(User::getAge, 25));
        System.out.println(one);
    }
}
