package com.example.dbg.controller;

import com.example.dbg.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user DBG_ZXX
 * @date 2018/10/15 18:23
 * @desc
 **/
@RestController
public class HelloWorldController {

    @Autowired
    IHelloService iHelloService;


    @RequestMapping(value = "hello" , method = RequestMethod.GET)
    public String hello(){
        return iHelloService.hello();
    }

}
