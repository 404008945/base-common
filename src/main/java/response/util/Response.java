package response.util;

import java.io.Serializable;

/**
 * response 用于规范返回前端格式
 * @param <T>
 */
public class Response<T> implements Serializable {

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

    public static <T> Response<T> ok(T t1,Class<T> clzz){
        Response<T> response = new Response<T>();
        response.setCode(200);
        response.setMessage("success");
        response.setData(t1);
        return response;
    }

    public static <T> Response<T> fail(int code,String message,Class<T> clzz){
        Response<T> response = new Response<T>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

}
