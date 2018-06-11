package com.regxdemo;
import java.util.regex.*;
public class RegexDemo {
    public static void main(String args[]){

        RegexDemo.say("这是一个正则表达式测试");
        String oa="abc45454545";
        if (Pattern.compile("[0-9,a-z|A-Z]+").matcher(oa).matches()){
            RegexDemo.say("数值");
        }else{

            RegexDemo.say("NO 数值");
        }

        if (Pattern.compile("[^abc]").matcher(oa).matches()){
            RegexDemo.say("数值1开头");
        }else{

            RegexDemo.say("NO");
        }
    }






//正则表达式的学习
    public static void say(Object da){
        System.out.println(da);



    }
}
