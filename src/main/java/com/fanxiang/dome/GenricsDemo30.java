package com.fanxiang.dome;

public class GenricsDemo30 {
public static void main(String args[]){
    Integer i[]=fun1(1,3,4,5,3,6,7,3);
    fun2(i);

}

    public static <T> T[] fun1(T...arg){

    return arg;
    }
    public static <T> void fun2(T param[]){
    System.out.print("接收泛型数组");

    for(T t:param){
        System.out.println(t+"|");
    }
    System.out.println();
    }
}
