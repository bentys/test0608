package com.IOfile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;

public class FileDemo1 {


    public static void main(String args[]){
        FileDemo1 T= new FileDemo1();
        File f=new File("dtest.txt");
        Date t1=new Date();
        String path="d:"+File.separator+"test1.txt_";
        try{
           f.createNewFile();

        }catch(IOException e){

            e.printStackTrace();
        }

        System.out.println(File.pathSeparator);
        System.out.println(File.separator);

        File f2=new File(path);
        try {
            f2.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        if (f.exists()){
            f.delete();
        }

        System.out.println(f.listFiles());
    }



}
