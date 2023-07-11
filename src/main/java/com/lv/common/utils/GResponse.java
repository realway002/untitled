package com.lv.common.utils;

import lombok.Data;

@Data
public class GResponse {
    private Boolean status;
    private String message;
    private Integer code;
    private Object data;
    private String token;

    public GResponse(){

    }
    public GResponse(Boolean status,String message, Integer code, Object data) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;
    }
    public GResponse(Boolean status,String message, Integer code, Object data,String token){
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;
        this.token = token;
    }
    public static GResponse success(){
        return new GResponse(true,"",0,null);
    }
    public static GResponse success(Object data){
        return new GResponse(true,"",0,data);
    }
    public static GResponse success(Object data,String token){
        return new GResponse(true,"",0,data,token);
    }

    public static GResponse fail(String message,int code,Object data){
        return new GResponse(false,message,code,data);
    }
    public static GResponse fail(String message){
        return new GResponse(false,message,99,null);
    }
    public static GResponse fail(int code){
        return new GResponse(false,"",code,null);
    }

    public static GResponse fail(String message,int code){
        return new GResponse(false,message,code,null);
    }

}
