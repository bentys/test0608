package eg;

/**
 * Created by xct15990138050 on 18/7/9.
 */
public class fanxing<T> {
    private T over;
    public T getOver(){
        return over;
    }

    public  void setOver() {
        setOver();
    }

    public  void setOver(T over){
        this.over=over;

    }
    public static void main(String[] args){

        fanxing<Boolean> over1=new fanxing<Boolean>();
        fanxing<Float> over2=new fanxing<Float>();
        over1.setOver(true);
        over2.setOver(12.3f);
        Boolean a=over1.getOver();
        System.out.println(over1.getOver());
        System.out.println(a);
        System.out.println(over2.getOver());

    }
}
