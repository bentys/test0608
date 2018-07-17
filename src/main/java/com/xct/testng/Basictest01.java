package com.xct.testng;

import org.junit.platform.commons.annotation.Testable;
import org.testng.annotations.Test;

public class Basictest01 {
//通过相应的设定公用的函数，方便后续内容调用。
    public void say(Object X){

        System.out.println("打印的内容为：>>>"+X);
    }
    @Test
    public void test01(){

        say("this is  one  test !");

    }

    public void testBefore(){

        say("每个测试用例集合第一次执行");
    }


    public void testAfter(){

        say("这是用例执行完成之后执行操作");
    }

}
