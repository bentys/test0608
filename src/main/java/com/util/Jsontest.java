package com.util;

import com.alibaba.fastjson.JSON;
import org.testng.annotations.Test;

public class Jsontest {
    @Test
    public void test2(){
        try {
            String jsonstr="{\"age\":22,\"id\":\"54e6fa76-1558-41bd-9195-413267674da8\",\"name\":\"张三\"}";
            Student s= JSON.parseObject(jsonstr, Student.class);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
