package com.Enum01;

public class ColorDemo01{

   public static  void main(String[] args){
       Color c1=Color.RED;
       System.out.println(c1.getName());
       Color c2=Color.GREEN;
       System.out.println(c2.getName());
       Color2 c3=Color2.C3;
       speak(c3);
   }


   public enum Color2{
       A1,B2,C3;
   }
   public static  void speak(Object test){
       System.out.println(test);
   }
}
