package com.RadomAccessFile01;
import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test01 {
    public static void main(String args[]) throws IOException {
        File f=new File("d:"+File.separator+"test.txt");
        RandomAccessFile rdf=null;
        rdf=new RandomAccessFile(f,"rw");
        String name=null;
        int age=0;
        name="zhangsan";
        age=21;
        rdf.writeBytes(name);
        rdf.writeBytes(String.valueOf(age));
        name="zhangsan";
        age=21;
        rdf.writeBytes(name);
        rdf.writeBytes(String.valueOf(age));
        name="zhangsan";
        age=21;
        rdf.writeBytes(name);
        rdf.writeBytes(String.valueOf(age));
        name="zhangsan";
        age=21;
        rdf.writeBytes(name+"\n");
        rdf.writeBytes(String.valueOf(age));

        rdf.close();

    }
}
