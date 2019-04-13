package aaaNiukewang;

import java.util.Scanner;

public class jituMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=0;
        if (n==0){
            a=0;
            b=0;
        }else if (n%2==0){
            if (n==2){
                a=1;
                b=0;
            }
            a=n/4;
            b=n/2;
        }else {
            a=0;
            b=0;
        }



        System.out.println(a+" "+b);
    }
}
