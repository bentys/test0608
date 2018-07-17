package com.NewClass;

import javax.annotation.PostConstruct;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "姓名"+this.name+";"+"年龄"+this.age;

    }

    public void person(){
        System.out.println("AAA");

    }
    public void person(String x){

        System.out.println(x);
    }

    public void person(String x,int y ){

        System.out.println(x+",,"+y);
    }



}
class mytest implements InvocationHandler{
    @PostConstruct

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
//    @Retention(null)
    @Override
    public int hashCode() {
        return super.hashCode();


    }

    public @interface Retention{
        RetentionPolicy value();
    }
}
