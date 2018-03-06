package com.job.Biz;

import com.job.Entity.User;
import com.job.utils.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

public class RegisterBiz {

    public static boolean addUser(HttpServletRequest req, HttpServletResponse resp){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkPWD = req.getParameter("checkPWD");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        User regUer = new User(username,password,phone,email);
        List<User> regUserList = (List<User>) req.getServletContext().getAttribute("regUserList");
        //正则表达式验证
        if(Utils.regForm(regUer)) {
            for (User user : regUserList) {
                if (Objects.equals(regUer.getName(), user.getName())) {
                    System.out.println("该用户已经存在，请重新注册");
                    return false;
                } else {
                    System.out.println("该用户可以使用！");
                    regUserList.add(user);

                    return true;
                }
            }
        }
    return false;
    }
}
