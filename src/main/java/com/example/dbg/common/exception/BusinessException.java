package com.example.dbg.common.exception;

import com.example.dbg.common.eumu.exception.BusinessEnum;

/**
 * @user DBG_ZXX
 * @date 2018/10/17 13:00
 * @desc
 **/
public class BusinessException extends RuntimeException {

    /**
     * 异常代码
     */
    private int code;

    /**
     * 异常说明
     */
    private String msg;

    /**
     * 异常链接URL
     */
    private String url;

    public BusinessException(){

    }

    public BusinessException(int code , String msg , String url){
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public BusinessException(BusinessEnum businessEnum){
        this.setValue(businessEnum.getCode() , businessEnum.getMsg() , null);
    }

    private void setValue(int code , String msg , String url){
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
