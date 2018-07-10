package com.NewClass;

import java.lang.reflect.Constructor;

public class InstanceDemo1 {

    public static void main(String[] args){

        Class<?> c=null;

        try{
            c=Class.forName("com.NewClass.person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();

        }
        person per=null;
        try{
            per=(person)c.newInstance();
        }catch (Exception E){
            E.printStackTrace();
        }
        per.setName("xx");
        per.setAge(1);
//        System.out.println(per);

        Class<?> c2=c.getComponentType();
        Class<?> c3=c.getSuperclass();
        Constructor<?> con[]=c.getConstructors();

        for (int i=0;i<con.length;i++){

            System.out.println(con[i]);
        }

//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(con);
    }

}
