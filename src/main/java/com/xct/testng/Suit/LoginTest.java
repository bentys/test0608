package com.xct.testng.Suit;

import com.xct.testng.Basictest01;

import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

public class LoginTest {
    @Test(timeOut = 10000)
    public void CaseTest01() throws InterruptedException {
           Thread.sleep(1000);
            new Basictest01().say("'测试用例01");
    }
    @Test(dependsOnMethods = {"CaseTest01"})
    public void CaseTest02(){
        new Basictest01().say("'测试用例02");
    }


    @AfterMethod
    public  void testMethodAfterMethod(){
        new Basictest01().say("AfterMethod");
    }
    @BeforeMethod
    public  void testMethodBeforeMethod(){
        new Basictest01().say("BeforeMethod");




    }

    @Test
    @Parameters({"x","y"})
    public void sum(int x,int y){
        int z;
        z=x+y;
        new Basictest01().say("计算结果是什么？z=x+y>>>>>>>>>>"+z);

    }

//    @Test(dataProvider = "mun")
@Test(parameters ="mun")

    public void s2(int mun){

//    TestNG中提供了一个Assert类：org.testng.Assert，该类继承了：java.lang.Object类。从TesNG的官方文档中，
// 我们可以看到，org.testng.Assert类是作为放置一系列断言的静态方法的容器。这些断言方法基本上是有2个或三个输入参数，
// 参数的顺序是 actualValue（实际值）, expectedValue（期望值） [, message（信息）].
        int m=mun*mun;
        System.out.println("查看下计算值之后断言情况:"+m);
    org.testng.Assert.assertEquals( m, 9, "输入错误");
    }
@Test
    public void s3(){

    Assert.assertEquals("xx","xx");


}

    @Test(invocationCount = 10)
    public void repeatThis() {

        System.out.println("repeatThis " );
    }
}

 class ClassCase02{


}
