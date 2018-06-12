package eg;

/**
 * Created by xct15990138050 on 18/6/11.
 */
public class StringMetthDemo {

    public static void main(String args[]){

    String str="     abcbabcbabcbacbabcabABCKKKKFm    ";
        say(str.length());
        say(str.indexOf(1));
        say(str.indexOf(3,4));
        say(str.indexOf('A'));
        say(str.charAt(1));
        say(str.indexOf('m',3));
        say(str.lastIndexOf('m',3));
        say(str.lastIndexOf('m'));
        say(str.replace('A','K'));
        say(str.replace('K','O'));

        say(str);
        say(str.isEmpty());
        say(str.toLowerCase());
        say(str.substring(1).split("2"));
        say(str.startsWith("A"));
        say(str.startsWith("B"));
        say(str.endsWith("B"));
        say(str.contains("A"));
        say(str.equalsIgnoreCase("a"));
        say(str.equals("a"));
        say(str.split("a"));
        String[] tr=str.split("a");
        for (int x=0;x<tr.length;x++){
            say(tr[x]);

        }

        say(str.substring(1,3));
        say(str.substring(2));
        say(str.toLowerCase());
        say(str.toUpperCase());
        say(str.trim());
        say(str.compareTo("a"));


    }



    public static void say(Object to){


        System.out.println(to);


    }
    }

