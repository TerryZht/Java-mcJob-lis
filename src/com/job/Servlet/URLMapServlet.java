package com.job.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * URL-->Servlet对于映射
 */
public class URLMapServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(Objects.equals(req.getServletPath(),"/regist.do")){
            req.getRequestDispatcher("/WEB-INF/views/regist.jsp").forward(req,resp);
        }else if (Objects.equals(req.getServletPath(),"/server.do")){
            req.getRequestDispatcher("/WEB-INF/views/server.jsp").forward(req,resp);
        }else if (Objects.equals(req.getServletPath(),"/mooc/top.do")){
            req.getRequestDispatcher("/WEB-INF/views/top.jsp").forward(req,resp);
        } else if (Objects.equals(req.getServletPath(),"/mooc/left.do")){
            req.getRequestDispatcher("/WEB-INF/views/left.jsp").forward(req,resp);
        }else if (Objects.equals(req.getServletPath(),"/mooc/catgory.do")){
            req.getRequestDispatcher("/WEB-INF/views/catgory.jsp").forward(req,resp);
        }else if (Objects.equals(req.getServletPath(),"/mooc/addBood.do")){
            req.getRequestDispatcher("/WEB-INF/views/addBook.jsp").forward(req,resp);
        }else if (Objects.equals(req.getServletPath(),"/mooc/showBooks.do")){
            req.getRequestDispatcher("/WEB-INF/views/showBooks.jsp").forward(req,resp);
        }
    }
}
