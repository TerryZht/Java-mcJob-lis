package com.job.Servlet;

import com.job.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

public class InitServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        //注册用户数据
        List<User> regUserList = new ArrayList<User>();
        this.getServletContext().setAttribute("regUserList",regUserList);
    }
}
