package eg;

/**
 * Created by xct15990138050 on 18/6/21.
 *
 * list可以重复
 * set 不能重复
 *
 */
import java.security.SecurityPermission;
import java.util.*;
public class ListDome02 {

    private static  void speek(Object op){

        System.out.println(op);
    }

    public static void main(String[] args){


        speek("test!!!");

        ArrayList a1=new ArrayList();
        a1.add("A01");
        a1.add("A02");
        a1.add("A03");
        a1.add("A04");
        a1.add("A05");

        speek("原来的集合原始列表"+a1);
        a1.add(1,"B01");//增加元素
        speek("修改的集合原始列表"+a1);
        speek("查询的集合原始列表"+a1.lastIndexOf("B01"));
        a1.remove(2);
        speek("删除元素之后的列表"+a1);
        a1.set(2,"C01");
        speek("配置相应的元素后列表"+a1);
        a1.get(2);
        speek("获取指定元素"+a1.get(2));

        for (int x=0;x<a1.size();x++){//遍历所有的数据集合

            speek(a1.get(x));
        }
    }
}
