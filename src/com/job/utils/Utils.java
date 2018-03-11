package com.job.utils;

import com.job.Entity.User;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Utils {
    /**
     * 用户注册信息
     * 正则表达式验证
     * 验证通过返回true
     * @param user
     * @return true false
     */
    public  static  boolean regForm(User user){
        String username = user.getName();
        String password = user.getPassword();
        String telphone = user.getTelphone();
        String email = user.getEmail();
        String regUser = "[a-zA-Z_]{3,}";
        String regPasswd = "\\d{6,}";
        String regTel = "[1][3578]\\d{9}";
        String regEmail = "[a-zA-Z_0-9]{3,}@([a-zA-Z]+|\\d+)(\\.[a-zA-Z]+)+";
        boolean matchUser = Pattern.matches(regUser, username);
        boolean matchPwd = Pattern.matches(regPasswd, password);
        boolean matchTel = Pattern.matches(regTel, telphone);
        boolean matchEmail = Pattern.matches(regEmail, email);
        if(matchUser&&matchPwd&&matchTel&&matchEmail){
            return true;
        }
        return false;
    }

    public static boolean isExistUser(User regUser, List<User> regUserList){
        for (User user : regUserList) {
            if (Objects.equals(regUser.getName(), user.getName())) {
                System.out.println("该用户已经存在，请重新注册");
                return false;
            }
        }
        return true;

    }
}
