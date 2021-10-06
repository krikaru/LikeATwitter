package org.example.springBoot.util;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectInterceptor extends HandlerInterceptorAdapter {

    //это для редиректов, иначе турболинк не допустит редирект. Пример: поставил лайк-не получил редирект на начальную страницу.
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null){
            String args = request.getQueryString() != null ? request.getQueryString() + "?" : "";
            String url = request.getRequestURI().toString() + args;
            response.setHeader("Turbolinks-Location", url);
        }
    }
}
