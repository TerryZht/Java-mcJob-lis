package com.job.Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String ,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        Set<String> keys = map.keySet();
        if(keys.contains("3")){
            System.out.println("yes");
        }else {
            map.put("3","c");
            System.out.println("no");
        }
        System.out.println(map.size());
    }
}
