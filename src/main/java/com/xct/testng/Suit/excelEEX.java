package com.xct.testng.Suit;

import org.testng.annotations.Test;

public class excelEEX {
    //主要为了验收相应的运行时，异常，
    //期望结果就是异常数据的内容。例如，我传入一个异常数据，为了的结果就是异常刚内容。
 @Test(expectedExceptions = RuntimeException.class)
    public void run1(){
        System.out.println("这是一个运行时候异常，需要直接抛出异常0000001");



    }
    @Test(expectedExceptions = RuntimeException.class)

    public void run2(){
        System.out.println("这是一个运行时候异常，需要直接抛出异常00000002");
        //手动return一个异常数据内容

        throw  new  RuntimeException();


    }
    @Test(dependsOnMethods = {"run1"}) //依赖的测试用例
    public void run3(){
        System.out.println("这是一个运行时候异常，需要直接抛出异常00000003");
        //手动return一个异常数据内容

        throw  new  RuntimeException();


    }


    //y依赖组进行测试
    @Test(groups = "group1")
    public void grun4(){
        System.out.println("测试依赖内容测试！！！！！！！！！000004");
        //手动return一个异常数据内容,
        throw  new  RuntimeException();
    }
    @Test(groups = "group1")
    public void grun5(){
        System.out.println("测试依赖内容测试！！！！！！！！！000005");
        //手动return一个异常数据内容
    }
    @Test
    public void grun6(){
        System.out.println("测试依赖内容测试！！！！！！！！！000006");
        //手动return一个异常数据内容
    }
    @Test(dependsOnGroups = {"group1"})
    public void grun7(){
        System.out.println("测试依赖内容测试！！！！！！！！！000007");
        //手动return一个异常数据内容
    }

}
