package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main111 {//字符串反转abcd->dcba

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        int n=string.length();
        String out="";
        String temp="";
        char ch=0;
        while (n>=1){
            ch=string.charAt(n-1);
            out=out+ch;
            n--;
        }
        System.out.println(out);
    }
}
