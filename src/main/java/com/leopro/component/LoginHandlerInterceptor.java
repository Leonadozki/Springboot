package com.leopro.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  实现登陆检查拦截器
 * */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从session中获取username属性判断是否登陆
        Object user = request.getSession().getAttribute("username");
        if(user == null){
            request.setAttribute("msg", "无用户信息，请先登陆");
            request.getRequestDispatcher("/login").forward(request, response);
            // 未登录，页面不放行
            return false;
        }else{
            // 已登录，放行页面
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
