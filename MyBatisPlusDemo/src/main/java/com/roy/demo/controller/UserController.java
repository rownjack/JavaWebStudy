package com.roy.demo.controller;

import com.roy.demo.api.UserApi;
import com.roy.demo.pojo.User;
import com.roy.demo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/person")
public class UserController implements UserApi {


    @Autowired
    UserService userService;


    @Override
    @GetMapping("getInfo")
    public List<User> getInfo(@RequestParam String name,  @RequestParam Integer age){  //@RequestParam，用来直接获取URL中的参数

        return userService.list();
    }




}
