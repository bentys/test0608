package eg;

/**
 * Created by xct15990138050 on 18/6/14.
 */
import java.util.*;
public class ListDome01 {
    public static void main(String [] args){




        ArrayList arr1=new ArrayList();
        arr1.add("oko1");
        arr1.add("oko2");
        arr1.add("oko3");
        arr1.add("oko4");
        arr1.add("oko5");
        arr1.add("oko6");

        ListDome01.sop(arr1);
        ListDome01.sop(arr1.size()+"字体长度");


        ArrayList arr2=new ArrayList();
        arr2.add("oko88");
        arr2.add("oko99");


        Iterator it=arr1.iterator();
        sop(it.hasNext());//获取迭代器

        while (it.hasNext()){
            sop(it.next());

        }

       sop(arr1.contains(arr2));
       sop(arr1.isEmpty());
        sop(arr1.indexOf("1"));
        sop(arr1.indexOf("oko6"));
        sop(arr1.remove("oko1"));
        sop(arr1);

    }

    public static void sop(Object obj){

        System.out.println(obj);
    }


}
