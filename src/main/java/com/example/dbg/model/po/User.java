package com.example.dbg.model.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 14:15
 * @desc
 **/
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 2010224724359909395L;

    private Long id;
    private String name;
    private Integer age;
    private String email;

}
