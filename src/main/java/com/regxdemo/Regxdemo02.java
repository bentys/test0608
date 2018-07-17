package com.regxdemo;
import java.util.*;
import java.util.regex.*;
public class Regxdemo02 {
    public static void main(String args[]){
        String str="A9V998VA8F8A9893";
        String pat="\\d+";

        Pattern P= Pattern.compile(pat);
        String s[]=P.split(str);

        for(int x=0;x<s.length;x++){
            System.out.println(s[x]+"\t");


        }


    }

}
