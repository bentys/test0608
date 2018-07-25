package com.httpClientTest.HttpClientTest;

/**
 * Created by xct15990138050 on 18/7/21.
 *
 */

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

//import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClentTest01 {
    @Test
    public void test01() throws IOException {
        //用来存放结果的
        String reslut;
        HttpGet get=new HttpGet("http://www.baidu.com");
        //这是是执行响应的GET请求操作
//        HttpClient client =new DefaultHttpClient();
        DefaultHttpClient client =new DefaultHttpClient();
//        HttpClient client =new HttpClientBuilder.create().build();

        HttpResponse response=client.execute(get);
        reslut= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.print(reslut);

    }
}
