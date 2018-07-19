package eg;

/**
 * Created by xct15990138050 on 18/7/4.
 */
import java.util.*;
public class Voter {
    public static  void speak(Object x){
        System.out.println(x);

    }
    public static void main(String[] args){


        Vector<String> v=new Vector<String>();
        v.add("java01");
        v.add("java02");
        v.add("java03");
        v.add("java04");
        for (int x=0;x<v.size();x++){
            speak( v.elementAt(x));


        }
        speak(v.elements());
        Enumeration en=v.elements();
        while (en.hasMoreElements()){

            speak(en.nextElement());
        }

    }
}
