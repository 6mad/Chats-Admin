package com.hubin.chats.filter;

import com.hubin.chats.dao.UserDao;
import com.hubin.chats.model.User;
import com.hubin.chats.services.UserService;
import com.hubin.chats.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT过滤器，拦截 /secure的请求
 */
@Slf4j
@WebFilter(filterName = "JwtFilter", urlPatterns = "/api/*")
public class JwtFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) {
    }

    final
    UserService userService;

    @Autowired
    JwtFilter(UserService userService){
        this.userService = userService;
    };

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;

        /*
         response.setCharacterEncoding("utf-8");  作用: 设置response对象的字符编码
         response.setHeader("Content-type", "text/html;charset=UTF-8");  通知浏览器以何种对应的编码打开
         response.setContentType("text/html;charset=UTF-8"); 既设置了response字符的编码, 也通知浏览器以何种码表打开数据
        */

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取 header里的token
        String token = request.getHeader("authorization");
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter("token");
        }

        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            chain.doFilter(request, response);
        }
        // Except OPTIONS, other request should be checked by JWT
        else {

            if (token == null) {
                response.getWriter().write("没有token！");
                return;
            }

            Integer id = JwtUtil.verify(token);
            if (id == null) {
                response.getWriter().write("token不合法！");
                return;
            }
            // 确认用户id是否存在
            User user = userService.verifyToken(token);
            if (!user.getId().equals(id))
                return;
            String userName = user.getName();
            String email = user.getEmail();
            //拦截器 拿到用户信息，放到request中
            request.setAttribute("id", id);
            request.setAttribute("userName", userName);
            request.setAttribute("email", email);
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {
    }
}