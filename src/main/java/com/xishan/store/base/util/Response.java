package com.xishan.store.base.util;

import java.io.Serializable;

/**
 * response 用于规范返回前端格式
 * @param <T>
 */
public class Response<T> implements Serializable {

    private boolean success;

    private String message;

    private T data;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public static <T> Response<T> ok(T t1,Class<T> clzz){
        Response<T> response = new Response<T>();
        response.setSuccess(true);
        response.setMessage("success");
        response.setData(t1);
        return response;
    }

    public static <T> Response<T> ok(T t1){
        Response<T> response = new Response<T>();
        response.setSuccess(true);
        response.setMessage("success");
        response.setData(t1);
        return response;
    }

    public static <T> Response<T> fail(String message,Class<T> clzz){
        Response<T> response = new Response<T>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> fail(String message){
        Response<T> response = new Response<T>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

}
