package com.hashmap01;
import java.util.*;
 class test{
     public static String toString(int v1){

         return "数值是"+v1;


     }
    public static void main(String[] args){

        System.out.println("--------------");
        Map<Integer,Integer> map=null;
        map=new HashMap<Integer, Integer>();
        map.put(1,2);
        map.put(1,2);
        map.put(1,2);
        map.put(1,2);
        map.put(1,2);
        map.put(1,2);
        int v1=map.get(1);

        System.out.println( test.toString(v1));
        System.out.println("--------------");
    }

}