package aaaaniu.ke.wang.datastructure;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a>c){
            t=a;
            a=c;
            c=a;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        System.out.println(a+"<"+b+"<"+c);
    }

}
