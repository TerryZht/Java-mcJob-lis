package com.job.filter;

import com.job.Entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class LoginFilter implements Filter{
    private FilterConfig config;

    public FilterConfig getConfig() {
        return config;
    }

    public void setConfig(FilterConfig config) {
        this.config = config;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String openValue = config.getInitParameter("openValue");
        if(Objects.equals("YES",openValue)){
            List<User> loginUserList =(List<User>) servletRequest.getServletContext().getAttribute("loginUserList");
            String loginUser = servletRequest.getParameter("loginUser");
            HttpServletResponse resp = (HttpServletResponse) servletResponse;
            if(loginUser!=null&loginUserList.size()>0){
                for(User user:loginUserList){
                    if(Objects.equals(loginUser,user.getName())){
                        filterChain.doFilter(servletRequest,servletResponse);
                    }else {
                        resp.sendRedirect("/");
                    }
                }
            }else {
                resp.sendRedirect("/");
            }
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}
