package com.example.dbg;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 12:56
 * @desc
 **/
public class DbgServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DbgApplication.class);
    }
}
