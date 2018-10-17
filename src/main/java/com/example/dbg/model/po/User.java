package com.example.dbg.model.po;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @user DBG_ZXX
 * @date 2018/10/16 14:15
 * @desc
 **/

public class User implements Serializable{

    private static final long serialVersionUID = 2010224724359909395L;

    private Long id;
    private String name;
    private Integer age;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
