package com.xct.testng;


import org.testng.annotations.*;

public class Basictest01 {
//通过相应的设定公用的函数，方便后续内容调用。
    public void say(Object X){

        System.out.println("打印的内容为：>>>"+X);
    }
    @Test
    public void testCase01(){

        say("this is  one  test...1 !");

    }
    @Test
    public void testCase02(){

        say("this is  one  test...2 !");

    }
//    在用例执行操作前标签
    @BeforeTest
    public void testBefore(){

        say("每个测试用例集合前次执行");
    }
// 在用例执行后标签
    @AfterTest
    public void testAfter(){

        say("这是用例执行完成之后执行操作");
    }

//beforetest,每个测试用例
    @BeforeMethod
    public   void testBeforeMethod(){

        say("每个测试用例前BeforeMethod");
    }

    //after 的内容进行测试
    @AfterMethod
    public void  testAfterMethod(){
        say("每个测试用例后testAfterMethod");

    }


    //   类的运行之前
    @BeforeClass


    public void ClassBeforeclassMethod(){
        new Basictest01().say("ClassBeforeclassMethod中的方法执行一次");
    }

    //    类的运行之后
    @AfterClass

    public void ClassAfrerclassMethod(){
        new Basictest01(). say("ClassAfrerclassMethod中的方法执行一次");

    }

    @BeforeSuite
    public void ClassBeforeSuite(){

        new Basictest01(). say("开始执行测试用例前ClassBeforeSuite中的测试套件执行");

    }

    @AfterSuite
    public void ClassAfterSuite(){

        new Basictest01(). say("开始执行测试用例后ClassBeforeSuite中的测试套件执行");


    }



}




