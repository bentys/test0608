package com.xct.testng.Suit;

import com.xct.testng.Basictest01;
import org.testng.annotations.Test;

public class Paytest {
    @Test
    public void CaseTest04(){
        new Basictest01().say("'开始支付测试用例04");
    }

    public void CaseTest03(){
        new Basictest01().say("'支付成功测试用例03");
    }
}
