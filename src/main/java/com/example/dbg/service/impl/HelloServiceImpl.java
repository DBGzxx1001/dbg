package com.example.dbg.service.impl;

import com.example.dbg.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 13:13
 * @desc
 **/
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String hello() {
        return "Hello World !!";
    }

}
