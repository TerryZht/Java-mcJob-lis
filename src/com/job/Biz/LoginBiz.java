package com.job.Biz;

import com.job.Entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

public class LoginBiz {
    public static boolean userLogin(HttpServletRequest req, HttpServletResponse resp){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        List<User> userList = (List<User>)req.getServletContext().getAttribute("regUserList");
        if(username!=null&&password!=null) {
            for (User user : userList) {
                if(Objects.equals(username,user.getName())&&Objects.equals(password,user.getPassword())){
                    List<User> loginUserList =(List<User>) req.getServletContext().getAttribute("loginUserList");
                    loginUserList.add(user);
                    req.getServletContext().setAttribute("loginUserList",loginUserList);
                    req.getServletContext().setAttribute("loginUser",username);
                    return true;
                }
            }
        }
        return false;
    }

}
