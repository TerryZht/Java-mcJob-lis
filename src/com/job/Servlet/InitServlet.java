package com.job.Servlet;

import com.job.Entity.Book;
import com.job.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        //注册用户数据
        List<User> regUserList = new ArrayList<User>();
        this.getServletContext().setAttribute("regUserList",regUserList);
        //登录用户数据
        List<User> loginUserList = new ArrayList<User>();
        this.getServletContext().setAttribute("loginUserList", loginUserList);

        //图书分类数据
        Map<String,Object> catgoryList = new HashMap<>();
        this.getServletContext().setAttribute("catgoryList", catgoryList);
        //图书数据
        List<Book> bookList = new ArrayList<>();
        this.getServletContext().setAttribute("bookList",bookList);
    }
}
