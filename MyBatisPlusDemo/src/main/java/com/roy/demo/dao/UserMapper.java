package com.roy.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.roy.demo.pojo.User;

import java.util.List;

/***
 * description: 
 * @author LuoYao
 * @version 1.0
 * @date 2021/8/29 21:38
 */

public interface UserMapper extends BaseMapper<User> {

    /***
     * description: selectAll
     * @author LuoYao
     * @version 1.0
     * @date 2021/8/29 22:12
     */
    List<User> selectAll();
}
