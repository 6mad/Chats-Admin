package com.hubin.chats.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    // 有效时长毫秒数
    private static final long EXPIRE_TIME = 7 * 24 * 60 * 60 * 1000;
    //  private static final long EXPIRE_TIME = 60 * 1000; //测试一分钟
    // token 密钥
    private static final String TOKEN_SECRET = "huHinGraduationProject2022";

    /**
     * @title 生成token
     * @discribtion
     */
    public static String generateToken(Integer id) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<String, Object>();
            header.put("typ", "JWT");
            header.put("alg", "HS256");
            String token = JWT.create()
                    .withHeader(header) // header
                    .withClaim("id", id)
                    .withExpiresAt(date) // 过期时间
                    .sign(algorithm); // 签名
            return token;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param token
     * @return id
     * @throws TokenExpiredException
     * @discribtion 验证token是否有效并返回user。id
     */
    public static Integer verify(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        try{
        DecodedJWT jwt = JWT.require(algorithm).build().verify(token);
        return jwt.getClaim("id").asInt();
        }catch (TokenExpiredException e){
            return null;
        }
        }

}
