package com.DateDemo;
import java.time.Year;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;

public class todayDemo01 {
    public static void main(String[] args){
        Date date=new Date();

        System.out.println(date);
    Calendar calender =null;
    calender =new GregorianCalendar();
    System.out.println(calender.get(calender.YEAR));
    System.out.println(calender.get(calender.MONDAY));
    System.out.println(calender.get(calender.SECOND));
    System.out.println(calender.get(calender.WEEK_OF_MONTH));
    DateFormat df1=null;
    DateFormat df2=null;
    df1=DateFormat.getDateInstance();
    df2=DateFormat.getDateTimeInstance();
    System.out.println(df1.format(new Date()));
    System.out.println(df2.format(new Date()));
    System.out.println();
    }
}
