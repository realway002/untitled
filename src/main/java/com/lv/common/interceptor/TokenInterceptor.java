package com.lv.common.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.lv.common.utils.TokenUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("Authorization");
        if(null != token){
            Boolean verify = TokenUtils.verify(token);
            if(verify){
                System.out.println("同故宫拦截器");
                return true;
            }
        }
        response.setContentType("application/json; charset=utf-8");
        try{
            //token认证失败或token不存在
            JSONObject json = new JSONObject();
            json.put("msg","token verify fail");
            json.put("code","50000");
            response.getWriter().append(json.toJSONString());
            System.out.println("认证失败，未通过拦截器");
        }catch (Exception e){
            e.printStackTrace();
            response.sendError(500);
            return false;
        }
        return false;
    }
}
