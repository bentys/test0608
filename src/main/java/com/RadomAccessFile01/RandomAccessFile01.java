package com.RadomAccessFile01;
import java.io.*;
import java.io.RandomAccessFile;
public class RandomAccessFile01  {

        public static void  main(String args[])throws Exception{

        File f =new File("d:"+File.separator+"test.txt");
        RandomAccessFile rdf=null;


        rdf=new RandomAccessFile(f,"r");

        String name=null;

        int age=0;

        byte b[] =new byte[8];
        rdf.skipBytes(12);
        for (int i=0;i<b.length;i++){
        b[i]=rdf.readByte();

        }
        name =new String(b);
        age=rdf.readInt();
        System.out.println("two======="+name);



        }

}
