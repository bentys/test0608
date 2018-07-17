package eg;

/**
 * Created by xct15990138050 on 18/6/30.
 */
import java.util.*;
public class ListArray01 {

    public static void main(String args[]){
        ArrayList <String> op=new ArrayList<String>();

        op.add("A10");
        op.add("A12");
        op.add("A13");
        op.add("A14");
        op.add("A15");
        speak(op);

       // op.remove(1);
       // op.clear();
        op.contains("A13");
        speak("长度"+op.size());
        speak("长度"+  op.toArray());
        speak("集合为空"+op.isEmpty());
        op.toArray();
        speak(op);
        speak("--------------------------------");
        menthod_2();

        //LIST 有序的,元素可以重复
        //SET 元素是无序,不能重复

        ArrayList <String> a3=new ArrayList<>();
        ArrayList  a4= new ArrayList();



    }

   public static  void  speak(Object x){
       System.out.println(x);
   }

    public static void menthod_2(){
        ArrayList <String> op2=new ArrayList<String>();

        op2.add("A10");
        op2.add("A12");
        op2.add("A13");
        op2.add("A14");
        op2.add("A15");

        ArrayList <String> op3=new ArrayList<String>();

        op3.add("A10");
        op3.add("A12");
        op3.add("A134");
        op3.add("A144");
        op3.add("A155");


        op2.retainAll(op3);

        speak(op2);
        speak(op3);
        speak(op2.retainAll(op3));
        speak(op2.containsAll(op3));
        speak(op2);
//获取迭代器,用于取出集合中元素,
        Iterator it=op3.iterator();
        speak(it.next());
        speak(it.next());
        while (it.hasNext()){

            speak(it.next());
        }

        //迭代器,适用于取出相应的元素方式,数组的循环取出操作。
    }

}
