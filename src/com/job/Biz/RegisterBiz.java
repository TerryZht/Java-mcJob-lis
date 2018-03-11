package com.job.Biz;

import com.job.Entity.User;
import com.job.utils.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

public class RegisterBiz { 
    //TODO:continue
    public static boolean addUser(HttpServletRequest req, HttpServletResponse resp){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkPWD = req.getParameter("checkPWD");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        User regUer = new User(username,password,phone,email);
        List<User> regUserList = (List<User>) req.getServletContext().getAttribute("regUserList");

        if((Objects.equals(password,checkPWD))&&Utils.regForm(regUer) && Utils.isExistUser(regUer,regUserList)) {
            regUserList.add(regUer);
            return true;
        }
        return false;
    }
}
