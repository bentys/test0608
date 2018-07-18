package com.xct.testng.testxml;

import com.xct.testng.Basictest01;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paterxmltest {

    @Parameters({"name","age"})
    @Test
    public void paramTest1(String name ,int age){

        new Basictest01().say(name+"----"+age);

    }
}
