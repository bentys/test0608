package com.runtimeDemo;

public class runtimeDemo02 {
    public static void main(String[] args){
        Runtime run=Runtime.getRuntime();
        Process pro=null;
        try{
            run.exec("notepad.exe");

        }catch (Exception e){
            e.printStackTrace();

        }
        try {
            Thread.sleep(111);
        }catch (Exception e){
            e.printStackTrace();
        }
      //  pro.destroyForcibly();

    }
}
