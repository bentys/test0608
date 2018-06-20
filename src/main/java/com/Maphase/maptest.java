package com.Maphase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maptest {
    public static void main(String[] args){
        Map<String,String> map=null;
        map=new HashMap<String, String>();
        map.put("AA2","bbb2");
        map.put("AA3","bbb3");
        map.put("AA4","bbb4");
        map.put("AA5","bbb5");
    Set<Map.Entry<String,String>> allset=null;
    allset=map.entrySet();
    Iterator<Map.Entry<String,String>> iter=null;
    iter=allset.iterator();

    while(iter.hasNext()){
        Map.Entry<String,String> ME=iter.next();
        System.out.println(ME.getKey()+
            "--->"+ME.getValue());

    }
    }

}
