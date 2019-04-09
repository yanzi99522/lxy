package aaaaniu.ke.wang.testMAIN;

import java.math.BigInteger;
import java.util.Scanner;

public class skewMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String  str=in.next();
            int l=str.length();
            int[]a=new int[l];
            char[] c=new char[l];
            String[] s=new String[l];
            int sum=0;
            for (int i=0;i<str.length();i++){
//                char[i]=str.charAt(l-i);
                a[i]=str.charAt(l-1-i)-'0';

//                System.out.println(str.charAt(l-1-i)-'0');
                int t=(int)(a[i]*(Math.pow(2,i+1)-1));
                sum=sum+t;
//                System.out.println(a[i]*(Math.pow(2,i+1)-1));
//                (str.charAt(l-i)-'0');
            }
            System.out.println(sum);

        }
    }
}
