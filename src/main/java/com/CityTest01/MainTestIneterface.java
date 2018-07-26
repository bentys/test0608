package com.CityTest01;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class MainTestIneterface {
    public static  void  main(String[] args) throws IOException, URISyntaxException {
          Common s1=new Common();
        Map<String,String> ss2=new HashMap<String,String>() ;
        ss2.put("name1","zhangsan1");
        ss2.put("name2","zhangsan2");
        ss2.put("name3","zhangsan3");
        ss2.put("name4","zhangsan4");
        ss2.put("name5","zhangsan5");
        ss2.put("name6","zhangsan6");

        //String strkey="name";
        String strkey="name1";
          //通过工具类获得相应参数
           String strtext=Common.getJsonValue(ss2,strkey);

          System.out.println(strtext);
          s1.createJson();

        StringEntity myEntity = new StringEntity("important message",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity));
        System.out.println(EntityUtils.toByteArray(myEntity).length);

        //
        ClientUtils s2=new ClientUtils();
        s2.HttpClient("222ff","fff","get");
        s2.HttpResponseTest();


    }
}
