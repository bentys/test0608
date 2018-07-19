package eg;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by xct15990138050 on 18/7/4.
 */

class Demo{


}

public class HaseSELL {


    public static void main(String args[]){
        HashSet<String> V1=new HashSet<String>();
        V1.add("1");
        V1.add("2");
       Voter.speak(V1.add("3"));
        Voter.speak(V1.add("3"));
        V1.add("4");

        Voter.speak(V1);

        Iterator it=V1.iterator();
        while(it.hasNext()){
            Voter.speak(it.next());
        }

        Demo n1=new Demo();
        Demo n2=new Demo();
        Demo n3=new Demo();
    }

}
