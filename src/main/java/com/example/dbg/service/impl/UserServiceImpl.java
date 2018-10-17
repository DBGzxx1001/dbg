package com.example.dbg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dbg.mapper.UserMapper;
import com.example.dbg.model.po.User;
import com.example.dbg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 17:56
 * @desc
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public List<User> selectAll() {
        System.out.println("hello");
        return  list(null);

    }

}
