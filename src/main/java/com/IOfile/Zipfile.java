package com.IOfile;

import java.io.File;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class Zipfile {


    public static void main(String[] args) throws Exception,ZipException {
        File file1=new File("d:"+File.separator+"test.ZIP");
        Zipfile zipfile1=new Zipfile(Filefile1);
        System.out.println("得出"+zipfile1.getClass());
    }
}
