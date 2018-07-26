package com.CityTest01;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ClientUtils {
    public static  void HttpClient(String url, String path,String HttpMethods) throws IOException, URISyntaxException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost:8082/users");
        CloseableHttpResponse response = httpclient.execute(httpget);
        HttpGet httpget1 = new HttpGet("http://www.google.com/search?hl=en&q=httpclient&btnG=Google+Search&aq=f&oq=");

        //该处的URI是导入的java1.8 java.net的包
        URI uri = new URIBuilder()
                .setScheme("http")
                .setHost("www.google.com")
                .setPath("/search")
                .setParameter("q", "httpclient")
                .setParameter("btnG", "Google Search")
                .setParameter("aq", "f")
                .setParameter("oq", "").build();



        HttpGet httpget2 = new HttpGet(uri);
        ClientUtils.Say(httpget2.getURI());

    }
    public static void HttpResponseTest(){
        HttpResponse response=new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"OK");
        System.out.println(response.getProtocolVersion());
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getReasonPhrase());
        System.out.println(response.getStatusLine().toString());
        response.addHeader("Set-Cookie","c1=a; path=/; domain=localhost");

        Header h1 = response.getFirstHeader("Set-Cookie");
        System.out.println(h1);

    }

    public static void Say(Object x){
        System.out.println("结果为"+x);
    }


}
