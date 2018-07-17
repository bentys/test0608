package com.IOfile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Sanner01 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("111");
        String str=scan.next();
        System.out.println(""+str);

        Scanner scan1=new Scanner(System.in);
        System.out.println("qingshushur");
        String str1=null;
        Date date=null;
        if(scan1.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){
            str1=scan1.next("\\d{4}-\\d{2}--\\d{2}$");

            try{
                date=new SimpleDateFormat("yyyy-MM-dd").parse(str1);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{

            System.out.println("shurucuowu");
        }
        System.out.println(date);


    }

}
