package com.qianfeng.springboothello.interceptor;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author FuZhiFan
 * @Date 2019/7/30
 *
 *
 */
@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("AuthImterceptor '''''");

        return true;
    }
}
