package com.fanxiang.dome;

public class dome01 {

    public <T> T fun(T t){

        return t;
    }
}


class GenricsDemo26{
    public static void main(String args[]){
        dome01 d=new dome01();
        String str=d.fun("新华");
        int i=d.fun(1);
        System.out.println(str);
        System.out.print(i);

    }

}
