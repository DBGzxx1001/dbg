package com.example.dbg.controller;

import com.example.dbg.model.po.User;
import com.example.dbg.service.IUserService;
import com.example.dbg.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 17:57
 * @desc
 **/
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;


    @RequestMapping(value = "getAllUser" ,method = RequestMethod.GET)
    List<User> getAllUser(){
        return userServiceImpl.selectAll();
    }


}
