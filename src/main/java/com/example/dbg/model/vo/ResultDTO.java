package com.example.dbg.model.vo;

import com.example.dbg.common.eumu.common.ResultEnum;

/**
 * @user DBG_ZXX
 * @date 2018/10/17 14:03
 * @desc
 **/
public class ResultDTO<T>  {
    /**
     * 返回数据
     */
    private T data ;
    /**
     * 相应码
     */
    private int code ;
    /**
     * 返回消息
     */
    private String msg ;

    public ResultDTO(){

    }



    public static <T>ResultDTO<T> build(ResultEnum resultEnum , T t){
        ResultDTO<T> resultDto = new ResultDTO<>();
        resultDto.setCode(resultEnum.getCode());
        resultDto.setMsg(resultEnum.getMsg());
        resultDto.setData(t);
        return resultDto;
    }

    public static <T>ResultDTO<T> build(ResultEnum resultEnum ){
        ResultDTO<T> resultDto = new ResultDTO<>();
        resultDto.setCode(resultEnum.getCode());
        resultDto.setMsg(resultEnum.getMsg());
        return resultDto;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
