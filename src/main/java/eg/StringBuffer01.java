package eg;

/**
 * Created by xct15990138050 on 18/6/12.
 */
public class StringBuffer01 {
    public static void main(String args[]){

    StringBuffer sb=new StringBuffer();
    StringBuffer sb1=new StringBuffer();
        sb1.append("1");
        sb1.append("2").append('3').append(true);
        sb1.append("2").append('3').append(true);
        sop(sb1.toString());
        sop(sb.toString());
        sb1.delete(1,2);
        sb1.insert(1,"333");
        sb1.insert(8,"333");
        sb1.reverse();
        sop(sb1.toString());
        sop(sb1.equals(sb));


    }


    public static void sop(Object str){

        System.out.println(str);
    }
}
