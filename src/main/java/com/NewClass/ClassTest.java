package com.NewClass;
import com.Enum01.Color;
import com.Enum01.ColorDemo01;
public class ClassTest {
    public static void main(String args[]){
        ColorDemo01.speak("xiaoming");
        ColorDemo01 x1=new ColorDemo01();
        Color x2= new Color("xiaoai");

        x x3=new x();
        ColorDemo01.speak(x1);
        ColorDemo01.speak(x2.getName());
        ColorDemo01.speak(x2.getClass().getName());
        ColorDemo01.speak(x3.getClass().getName());


        Class<?> c1=null;
        Class<?> c2=null;
        Class<?> c3=null;
        Class<?> c4=null;
        try{
            c1=Class.forName("com.NewClass.ClassTest");

        }catch (ClassNotFoundException e){

            e.printStackTrace();
        }

        c2=new ClassTest().getClass();

        c3=x.class;

        ColorDemo01.speak(c1);
        ColorDemo01.speak(c2);
        ColorDemo01.speak(c3);


    x q2=null;

    }



    public static void Class01(String packbagename) throws   ClassNotFoundException{



    }
}

class x{
    int x;
    public void x(){
        System.out.println("无参数构造");

    }
        }

class innul{




}