package com.testNG;

public class test01 {
    public int zore(int x1){
        int x2;
        x2=x1%2;

        if (x2==0){
            return 1;

        }else {
         return 0;
        }
    }

    public static  void  main(String args[]){

      System.out.println(new test01().zore(1));
    }
}
