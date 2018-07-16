package com.ptt;
import java.util.*;
import java.io.*;
import java.lang.*;

public class man {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddres() {
        return homeAddres;
    }

    public void setHomeAddres(String homeAddres) {
        this.homeAddres = homeAddres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String homeAddres;
    private int age;

    public void man(String name,String homeAddres,int age){
        this.age=age;
        this.homeAddres=homeAddres;
        this.name=name;
        System.out.println("V");

    }
    public static void main(String args[]){

        man  m1;
        m1=new man();
        System.out.println("xx");

        m1.speak(m1.age);



    }

    public static  void speak(Object X){
        System.out.println(""+X);

    }

}
