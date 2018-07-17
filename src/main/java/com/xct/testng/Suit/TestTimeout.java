package com.xct.testng.Suit;

import com.xct.testng.Basictest01;
import org.testng.annotations.Test;

public class TestTimeout {

    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
//        new Basictest01().say("op");
        Thread.sleep(5000);
        //lp
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        while (true){
            // do nothing
        }

    }
}

