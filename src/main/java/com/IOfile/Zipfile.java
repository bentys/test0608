package com.IOfile;

import java.io.File;
import java.io.Serializable;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import static javafx.scene.input.KeyCode.S;

public class Zipfile {


    public static void main(String[] args) throws Exception,ZipException {
        File file1=new File("d:"+File.separator+"test.ZIP");
        Person P1=new Person("xiaoming",10);
        System.out.println(P1.toString());
    }
}

class Person implements Serializable {

    private transient String name;
    private int age;

    public Person (String name,int ages){
    this.name=name;
    this.age=age;

    }
    public String toString(){

        return "姓名"+this.name+"；年龄："+this.age;
    }
}

