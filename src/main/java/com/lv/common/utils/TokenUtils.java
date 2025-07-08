package com.lv.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.lv.bean.entity.User;

import java.util.Date;

public class TokenUtils {
    private static final long EXPIRE_TIME= 10*60*60*1000;
    private static final String TOKEN_SECRET="lvmh";//密钥

    public static String sign(User user){
        String token = null;
        try {
            Date expireTime = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create().withIssuer("auth0").withClaim("userName",user.getUserName()).withExpiresAt(expireTime)
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        }  catch (Exception e) {
            e.printStackTrace();
        }

        return token;
    }

    public static Boolean verify(String token) {
        try {
            JWTVerifier auth0 = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT verify = auth0.verify(token);
            System.out.println("认证通过：");
            System.out.println("username: " + verify.getClaim("username").asString());
            System.out.println("过期时间：      " + verify.getExpiresAt());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
