package com.IOfile;
import org.springframework.core.io.ByteArrayResource;

import java.io.File;
import java.io.*;
import java.util.*;
public class Demo02 {
    public static void main(String args[])throws Exception{

    File f=new File("d"+File.separator+"test.txt");
    Writer out=null;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        System.err.println("wwww");
        System.err.println("周期");
        System.out.println(bos);
        System.out.println();


        IteratorTest.RetrunIterator(new TreeSetDemo03());

    }
}

class TreeSetDemo03{
    public static void Treevoid(){
    Set<String> allset =new TreeSet<String>();
    allset.add("hellow");
    allset.add("tom");
    allset.add("javke");
    allset.add("kiity");
    allset.add("hel");
    allset.add("Tlow");
    System.out.println(allset);

    }


}
class IteratorTest {
    public static void RetrunIterator(TreeSetDemo03 T3) {

        List<String> all = new ArrayList<String>();
        all.add("name01");
        all.add("name02");
        all.add("name03");
        all.add("name04");
        all.add("name05");


        Iterator<String> iter = all.iterator();
        while (iter.hasNext()) {

            System.out.println(iter.next() + "v");


        }
        iter.remove();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "v");
        }


    }
}
