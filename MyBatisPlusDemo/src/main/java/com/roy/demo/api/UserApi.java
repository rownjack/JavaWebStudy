package com.roy.demo.api;

import com.roy.demo.pojo.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/***
 * description:
 * @author LuoYao
 * @version 1.0
 * @date 2021/8/29 21:43
 */

@Api(tags = "个人信息接口")
public interface UserApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",paramType = "query",value = "用户名",required = true),
            @ApiImplicitParam(name = "age",paramType = "query",value = "年龄",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 401,message = "你没权限"),
            @ApiResponse(code = 403,message = "你被禁止访问了"),
            @ApiResponse(code = 404,message = "没找到，哈哈哈")
    })
    @ApiOperation("获取个人信息")
    public List<User> getInfo(String name,  Integer age);
}
