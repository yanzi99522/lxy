package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class shuzifanzhuanMain {
    static int reverse(int a){
        int t=0,s=0;
        if (a>=10){
            while (a!=0){
                t=a%10;
                s=10*t+s;
                a=a/10;

            }
        }else {
            return 0;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
           if ((reverse(a)+reverse(b))==reverse(a+b)){
               System.out.println(a+b);
           }else {
               System.out.println("NO");
           }
        }
    }
}
