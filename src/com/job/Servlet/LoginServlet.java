package com.job.Servlet;

import com.job.Biz.LoginBiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(LoginBiz.userLogin(req,resp)){
            String loginUser = req.getParameter("loginUser");
           req.getRequestDispatcher("/server.do?loginUser=" + loginUser).forward(req,resp);
        }else{
            resp.sendRedirect("/");
        }
    }
}
