package com.example.dbg.mybatisPlus;

import com.example.dbg.mapper.UserMapper;
import com.example.dbg.model.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 14:24
 * @desc mybatisPlus 测试
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAllTest(){
        List<User> list = userMapper.selectList(null);
//        list.forEach(System.out::println);
        List<User> list1 = new ArrayList<>();
        list.forEach(cc -> list1.add(cc));
        list1.forEach(user -> System.out.println(user));
    }

}
