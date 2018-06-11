package com.runtimeDemo;

import static com.sun.webkit.perf.WCFontPerfLogger.log;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class runrimeDemo01 {
    public static void main(String args[]){
        System.out.println("a");
        Runtime run=Runtime.getRuntime();
        System.out.println(run.maxMemory());
        System.out.println(run.freeMemory());
    }
}
