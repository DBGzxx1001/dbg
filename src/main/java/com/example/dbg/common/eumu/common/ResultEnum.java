package com.example.dbg.common.eumu.common;

/**
 * @user DBG_ZXX
 * @date 2018/10/17 13:53
 * @desc 返回相应数据枚举类
 **/
public enum  ResultEnum {
    /**
     * 成功
     */
    SUCC(000 , "成功"),

    /**
     * 失败
     */
    FAIL(001 , "失败");


    private int code;
    private String msg;

    ResultEnum(int code , String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getMsg(int code){
        for(ResultEnum resultEnum : ResultEnum.values()){
            if(resultEnum.code == code){
                return resultEnum.getMsg(code);
            }
        }
        return null;
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
}
