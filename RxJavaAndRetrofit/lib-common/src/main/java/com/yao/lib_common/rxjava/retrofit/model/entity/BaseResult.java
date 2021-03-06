package com.yao.lib_common.rxjava.retrofit.model.entity;

/**
 * @Description:
 * @Author: YaoPaine
 * @CreateDate: 2017/11/2 下午9:57
 * @Version:
 */

public class BaseResult<T> {
    private final static int successCod = 0;
    
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static int getSuccessCod() {
        return successCod;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
