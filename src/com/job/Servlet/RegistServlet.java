package com.job.Servlet;

import com.job.Biz.RegisterBiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

    //TODO:注册失败后的逻辑显示?
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //解析表单并添加数据
            if(RegisterBiz.addUser(req,resp)){
                String username = req.getParameter("username");
                req.setAttribute("username",username);
                resp.sendRedirect("/?reguser="+username);
            }else{
                resp.sendRedirect("/");
            }
    }
}
