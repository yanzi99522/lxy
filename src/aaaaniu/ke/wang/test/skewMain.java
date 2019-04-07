package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class skewMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            long sum=0;
            for (int i=0;i<str.length();i++){
               int a=Integer.parseInt(String.valueOf(str.charAt(i))) ;
//                System.out.println(a);
               int temp=a* ((int)Math.pow(2,str.length()-i)-1);
//                System.out.println(temp);
                sum=sum+temp;

            }
            System.out.println(sum);
        }
    }
}
