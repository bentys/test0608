package eg;

import java.util.LinkedList;

/**
 * Created by xct15990138050 on 18/7/4.
 */
public class LinkListDome {
    public static void main(String[] args){

        LinkedList<String> v1=new LinkedList<String>();
        v1.add("java01");
        v1.add("java02");
        v1.add("java03");
        v1.add("java04");
        v1.addFirst("pop1");
        v1.addFirst("pop2");
        Voter.speak(v1.getFirst());
        v1.getFirst();
        Voter.speak(v1);
        v1.removeFirst();
        Voter.speak(v1);
        v1.getFirst();
        Voter.speak(v1.getFirst());

        v1.removeFirst();
        v1.getLast();

        Voter.speak(v1.getFirst());
        Voter.speak(v1.peekFirst());
        Voter.speak(v1.removeFirst());
        Voter.speak(v1.removeFirst());
        Voter.speak(v1);
        Voter.speak(v1.peekFirst());
        Voter.speak(v1);
        Voter.speak(v1.removeFirst());


    }
}
