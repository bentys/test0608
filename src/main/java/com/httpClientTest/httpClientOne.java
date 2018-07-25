package com.httpClientTest;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class httpClientOne {

    public static void  main(String[] args){
        HttpGetTest01();

    }

    public static void HttpGetTest01(){
        CloseableHttpClient s1= HttpClients.createDefault();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet get=new HttpGet("http://localhost:8082/users");
        CloseableHttpResponse response = null;
        JSONObject jsonResult = null;
        String strResult;


        {
            try {
                response = httpclient.execute(get);
                System.out.println(response.getStatusLine());
                System.out.println(response.getAllHeaders().length);
                Header[] s2=response.getAllHeaders().clone();
                System.out.println(s2);
                System.out.println(response.getEntity());
                System.out.println(response.getEntity().isChunked());
                System.out.println(response.getEntity().getContent());
                System.out.println(response.getEntity().getContentEncoding());
                System.out.println(response.getEntity().getContentEncoding());

                strResult = EntityUtils.toString(response.getEntity());
                System.out.println(strResult);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



}
