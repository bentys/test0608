package eg;

/**
 * Created by xct15990138050 on 18/7/9.
 */
import java.util.*;
public class Mapcolltion {


    public static void main(String[] args){
        Map<Integer ,String> op=new HashMap<Integer ,String>();
        op.put(1,"abc");
        op.put(2,"abc33");
        op.put(3,"abc34");
        op.put(4,"abc35");
        op.put(5,"abc36");
        op.put(6,null);
        System.out.println(op);
        System.out.println(op.get(1));
        System.out.println( "1是否都存在这样===="+op.containsKey(1));
        System.out.println( "\"1\"是否都存在这样===="+op.containsKey("1"));
        System.out.println( "\"1\"是否都存在这样===="+op.remove("1"));
        System.out.println( "\"1\"移除===="+op.remove(1));
        System.out.println(op.values());
        Collection <String> coll=op.values();
        System.out.println(coll);
    }


}
