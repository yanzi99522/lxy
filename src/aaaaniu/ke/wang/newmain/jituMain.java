package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class jituMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=0;
        if (n%2==0){
            a=(n/4+n%4/2);
            b=n/2;


        }else {

        }
        System.out.println(a+" "+b);
    }
}
