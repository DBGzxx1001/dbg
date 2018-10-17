package com.example.dbg.common.eumu.exception;

/**
 * @user DBG_ZXX
 * @date 2018/10/17 13:28
 * @desc
 **/
public enum BusinessEnum {

    /**
     * token 异常
     */
    TOKEN_ERR(601 , "token解析错误"),

    /**
     * 权限异常
     */
    AUTH_ERR(611 , "权限异常"),

    /**
     * 网络异常
     */
    NET_ERR(621 , "网络异常"),

    /**
     * 业务异常
     */
    SERVICE_EXCEPTION(651,"业务异常"),

    /**
     * 其他异常
     */
    OTHER_ERR(781 , "其他异常");


    private int code;
    private String msg;

    BusinessEnum(int code ,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(Integer code){
        for(BusinessEnum rce : BusinessEnum.values()){
            if(rce.getCode() == code){
                return  rce.getMsg();
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
