package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class yiyuanerciMain {
    static void fangcheng(int a,int b,int c){
        int d1=b*b-4*a*c;
        double d=Math.sqrt((double)d1);
        double x1,x2;
        double x;
        if (d>0){
            x1=(-b+d)/2*a;
            x2=(-b-d)/2*a;
            System.out.println("x1="+x1+","+"x2="+x2);
        }else if(d==0){
            x=(-b)/2*a;
            System.out.println("x="+x);
        }else {
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
//        int[] rr=new int[n];
        while (n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            fangcheng(a,b,c);
        }

    }
}
