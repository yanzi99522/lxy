package a0721;

/**
 * @author lxy
 */

public class Test {
   static String test(String s){
        s="形参";
       System.out.println(s);
       return s;

    }
    public static void main(String[] args) {
        String string="实参";
        System.out.println(string);
        System.out.println(test(string));;
    }
}
