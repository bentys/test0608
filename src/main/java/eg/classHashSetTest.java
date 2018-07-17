package eg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * Created by xct15990138050 on 18/7/5.
 */
public class classHashSetTest {

    public static void speak(Object x){

        System.out.println(x);
    }
    public static void main(String[] args){

        HashSet hs=new HashSet();
        hs.add(new Person("java02",122));
        hs.add(new Person("java02",122));
       // hs.add(new Person("java03",125));
        hs.add(new Person("java04",124));
       // hs.add(new Person("java05",126));

        Iterator it =hs.iterator();
        while (it.hasNext()){

            Person P=(Person)it.next();
            speak(P.getName()+"...."+P.getAge());

        }
    }

}

class Person{
    private String name;
    private int age;
    Person(String name,int age){

        this.age=age;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person))
            return false;
        Person p=(Person)obj;
        System.out.println(this.name+".."+this.age);
        return this.name.equals(p.name)&&this.age==p.age;
    }
}
