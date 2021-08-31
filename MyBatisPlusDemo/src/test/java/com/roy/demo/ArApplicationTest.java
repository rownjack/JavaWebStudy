package com.roy.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.roy.demo.pojo.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author YuWenbo
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2019/6/29 11:39
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArApplicationTest {
    @Test
    public void test(){
        User user = new User();
        user.selectAll().forEach(System.out::println);
    }
}
