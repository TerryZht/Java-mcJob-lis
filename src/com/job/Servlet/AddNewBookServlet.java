package com.job.Servlet;

import com.job.Entity.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddNewBookServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO:jsp页面中jstl解析分类数据
            String id = req.getParameter("id");
            String bookName = req.getParameter("bookName");
            String catgoryName = req.getParameter("catgoryName");
            double price = Double.parseDouble(req.getParameter("price"));
            String description = req.getParameter("description");
            Book book = new Book(id,bookName,catgoryName,price,description);
            List<Book> bookList = (List<Book>)req.getServletContext().getAttribute("bookList");
            if(!bookList.contains(book)){
                bookList.add(book);
            }
            req.getServletContext().setAttribute("bookList",bookList);
            req.getRequestDispatcher("/mooc/addBood.do").forward(req,resp);
    }
}
