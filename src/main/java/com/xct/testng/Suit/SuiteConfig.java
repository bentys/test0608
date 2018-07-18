package com.xct.testng.Suit;

import com.xct.testng.Basictest01;
import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public  void beforeSutie(){

        new Basictest01().say("初始化测试用例集合执行前，方便为了本次执行");

    }

    @AfterSuite
    public  void AfrerSutie(){

    new Basictest01().say("初始化测试用例集合执行后，方便为了下次执行");

    }







}
