package aNiuKeWang;

import java.util.Scanner;

public class Dain {
    static int dan(int n){
        int a=n/10;
        int b=n%10;
        int c=a+b;
        if (c<10){
            return c;
        }else {
            return dan(c);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int p=in.nextInt();
        System.out.println(dan(m));
        System.out.println(dan(p));
    }
}
