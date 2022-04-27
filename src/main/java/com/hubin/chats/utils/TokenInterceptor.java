package com.hubin.chats.utils;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html;charset=utf-8");
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        HashMap<String, String> result  = new HashMap<>();
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            token = request.getHeader("Authorization");
        }
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter("token");
        }
        result.put("message","token认证失败");
        if (handler instanceof HandlerMethod) {
            if (!StringUtils.isEmpty(token)) {
//                try {
//                    if (jwtUtil.verify(token)) {
//                        return true;
//                    }
//                } catch (TokenExpiredException e) {
//                    e.printStackTrace();
//                    result.put("message", "token已过期！");
//                } catch (JWTVerificationException e) {
//                    e.printStackTrace();
//                }
            } else {
                result.put("message","token为空");
            }
        }
        result.put("code","401");
        response.setStatus(401);
        response.getWriter().write(JSONObject.toJSONString(result));
        response.getWriter().close();
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
           }
}