package a0811;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        String string=in.next();
        String s=string.substring(0,string.length()-1);
        System.out.println(s);
    }
}
