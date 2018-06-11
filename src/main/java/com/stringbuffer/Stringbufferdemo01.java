package com.stringbuffer;

public class Stringbufferdemo01 {
    public static void fun(StringBuffer a){
        a.append(" MDLA ").append(" liuliu ");
    }

    public static void main(String args[]){
        StringBuffer buf=new StringBuffer();
        buf.append(" bVA ");
        fun(buf);
        System.out.println(buf);
        buf.reverse();
        System.out.println(buf);
        String r="op";
        buf.replace(1,3,r);
        System.out.println(buf);


    }
}
