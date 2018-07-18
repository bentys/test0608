package com.xct.testng.testxml;

import com.xct.testng.Basictest01;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testxmlDate {
    //参数化 内容，Object内容


    @Test(dataProvider = "data")
    public void paramTest1(String name ,int age){

        new Basictest01().say(name+"----"+age);

    }

    @DataProvider(name="data")
    public Object[] [] patardata(){
        Object [] [] o=new Object[][]{
                {"zhansg",11},
                {"dafa",33}

        };
        return o;

    }
}
