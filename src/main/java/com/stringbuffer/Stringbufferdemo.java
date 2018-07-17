package com.stringbuffer;

public class Stringbufferdemo {

    public static  void main(String args[]){
        StringBuffer buf=new StringBuffer();
        buf.append(1);
        buf.append("A").append("B");
        buf.append(true);
        buf.append("STRING");
        System.out.println(buf);
    }
}
