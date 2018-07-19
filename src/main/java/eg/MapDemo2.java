package eg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by xct15990138050 on 18/7/10.
 */
public class MapDemo2 {
    public static void main(String[] args){

        Map<String,String> op= new HashMap<String,String>();
        op.put("A1","V");
        op.put("A2","V");
        op.put("A3","V");
        op.put("A4","V");
        op.put("A5","V");
        op.put("A6","V");
        op.put("A7","V");

        System.out.println(op);
        for (String key:op.keySet()){

            System.out.println(key+"===="+op.get(key));
        }

        System.out.println("===");
    }
}
