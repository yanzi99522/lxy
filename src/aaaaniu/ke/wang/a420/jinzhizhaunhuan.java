package aaaaniu.ke.wang.a420;

import java.math.BigInteger;
import java.util.Scanner;

public class jinzhizhaunhuan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger n;
        while (in.hasNext()){
         n=in.nextBigInteger();
//            String s="",t;
//            while (n!=0){
//                t=n%2+"";
//                s=t+s;
//                n=n/2;
//            }
            System.out.println(n.toString(2));
        }
    }
}
