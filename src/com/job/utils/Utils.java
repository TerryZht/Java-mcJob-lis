package com.job.utils;

import com.job.Entity.User;

public class Utils {
    /**
     * 正则表达式验证
     * @param user
     * @return
     */
    public  static  boolean regForm(User user){
        String username = user.getName();
        String password = user.getPassword();
        String telphone = user.getTelphone();
        String email = user.getEmail();

        return false;
    }
}
