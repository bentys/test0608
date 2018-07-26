package com.httpClientTest;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.net.URISyntaxException;

public class httpClientThere {
    public  static  void  HttpGetMotheds() throws IOException, URISyntaxException {
        CloseableHttpClient httpclient= HttpClients.createDefault();
        HttpGet httpget=new HttpGet("http://localhost:8082/users");
        CloseableHttpResponse response = null;

        URIBuilder uri = new URIBuilder()
                .setScheme("http")
                .setHost("www.google.com")
                .setPath("/search")
                .setParameter("q", "httpclient")
                .setParameter("btnG", "Google Search")
                .setParameter("aq", "f")
                .setParameter("oq", "");
        System.out.printf("uri---------------%s%n", uri.toString());
        {
            try {
                response = httpclient.execute(httpget);
//                response = httpclient.execute(uri);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        response.close();

        String url = "http://www.google.com/search?hl=en&q=httpclient&btnG=Google+Search&aq=f&oq=";
        URIBuilder uriBuilder = new URIBuilder(url);
        System.out.println(uriBuilder.getScheme());
        System.out.println(uriBuilder.getUserInfo());
        System.out.println(uriBuilder.getHost());
        System.out.println(uriBuilder.getPort());
        System.out.println(uriBuilder.getPath());
        System.out.println(uriBuilder.getQueryParams());
        System.out.println(uriBuilder.getFragment());
        System.out.println(uriBuilder.getCharset());

    }


    public static void main(String[] args) throws IOException, URISyntaxException {
        HttpGetMotheds();
    }



}
