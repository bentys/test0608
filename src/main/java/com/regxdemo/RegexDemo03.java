package com.regxdemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo03 {
        public static void main(String[] args[]){
            String str="AKFKAO149F8A00FA08014K9GK90KA0K014";
            String pat="\\d+";

            Pattern p=Pattern.compile(pat);
            Matcher m=p.matcher(str);
            String newString =m.replaceAll("-");

            System.out.println(newString);

        }
}
