package com.xct.testng.Suit;

import org.testng.annotations.Test;

public class excelEEX {
    //主要为了验收相应的运行时，异常，
    //期望结果就是异常数据的内容。例如，我传入一个异常数据，为了的结果就是异常刚内容。
 @Test      //(expectedExceptions = RuntimeException.class)
    public void run1(){
        System.out.println("这是一个运行时候异常，需要直接抛出异常");



    }
    @Test(expectedExceptions = RuntimeException.class)

    public void run2(){
        System.out.println("这是一个运行时候异常，需要直接抛出异常");
        //手动return一个异常数据内容

        throw  new  RuntimeException();


    }

}
