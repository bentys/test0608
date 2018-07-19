package com.xct.testng.testxml;

import com.xct.testng.Basictest01;
import org.testng.annotations.Test;

public class Threexml08 {
    //多线程测试
    @Test
    public  void  ThereRun01(){

    new Basictest01().say("打印相应的线程ID:"+Thread.currentThread().getId());

    }
    @Test
    public  void  ThereRun02(){

        new Basictest01().say("打印相应的线程ID:"+Thread.currentThread().getId());

    }
    @Test
    public  void  ThereRun03(){

        new Basictest01().say("打印相应的线程ID:"+Thread.currentThread().getId());

    }
    @Test
    public  void  ThereRun04(){

        new Basictest01().say("打印相应的线程ID:"+Thread.currentThread().getId());

    }
    @Test
    public  void  ThereRun05(){
        new Basictest01().say("打印相应的线程ID:"+Thread.currentThread().getId());



    }
}
