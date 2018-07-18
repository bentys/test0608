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







    @Test(groups = "test1")
    @Parameters({"x","y"})
    public void sum(int x,int y){
        int z;
        z=x+y;
        new Basictest01().say("计算结果是什么？z=x+y>>>>>>>>>>"+z);

    }

//    @Test(dataProvider = "mun")
    @Test(parameters ="mun",groups = "test2")

    public void s2(int mun) {

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

    @Test(invocationCount = 3)
    public void repeatThis() {

        System.out.println("repeatThis " );
    }

    @DataProvider(name="name111")//通过相应的DataProvider进行复制操作，定义相应的值
    public static Object [] [] DATA(){
        return new Object[][]{
                {"xiaom","AAAA"},
                {"XIAOM","BBBB"},
                {"xiaoS","CCCC"}

        };
    }


    @Test(dataProvider="name111") //需要确认相应的内容
    public void  Perter(String name,String address){

        StringBuffer r1=new StringBuffer();
            r1.append(name);
            r1.append(address);

            System.out.println(r1);

    }

    @BeforeMethod
    public void  AfterMothed(){

        new Basictest01().say("每次执行用例前都会执行一次。");
    }

    @AfterMethod
    public void  Bf(){

        new Basictest01().say("每次执行用例后都会执行一次。");



    }


    @BeforeClass
    public void  Afrcall(){

        new Basictest01().say("每次类前面都会执行一次。");
    }

    @AfterClass
    public void  Bfrcall(){

        new Basictest01().say("每次类后面都会执行一次。");
    }


    @Test(enabled =false)
    public  void  onon(){
        new Basictest01().say("忽略测试用例校验检查，检查关于enable 的使用");

    }

    @BeforeGroups("test1")
    public  void  KKA1(){
        new Basictest01().say("BeforeGroups内容的根据测试分组\"test1\"出现。");

    }
    @AfterGroups("test1")
    public  void  KK3A1(){
        new Basictest01().say("AfterGroups内容的根据测试\"test1\"分组出现。");

    }





}


