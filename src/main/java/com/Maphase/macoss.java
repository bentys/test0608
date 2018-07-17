package com.Maphase;

import sun.net.www.http.HttpClient;

import java.io.Closeable;

public class macoss {
    private  String name;
    private  int age;
    public macoss(String name,int age){
        this.name=name;
        this.age=age;
    }
@Override
    public String toString() {
        return "name>>>>"+name+","+"age>>>>>"+age;
    }



    public static void main(String[] args){
        System.out.println(new macoss("xiaom",2));

    }
}
