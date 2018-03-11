package com.job.Servlet;

import com.job.Entity.Catgory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class AddCatgoryServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String id = req.getParameter("id");
            String catgoryName = req.getParameter("catgoryName");
            String description = req.getParameter("description");
            Catgory catgory = new Catgory(id, catgoryName, description);
            Map<String, Object> catgoryList = (Map<String, Object>) req.getServletContext().getAttribute("catgoryList");
            Set<String> keys = catgoryList.keySet();
            boolean is = keys.contains(id);
            System.out.println(keys);
            if(id!=null&&catgoryName!=null) {
                if(!keys.contains(id)){
                    catgoryList.put(id,catgory);
                }
            }
            req.getServletContext().setAttribute("catgoryList", catgoryList);
            req.getRequestDispatcher("/mooc/catgory.do").forward(req,resp);
    }
}
