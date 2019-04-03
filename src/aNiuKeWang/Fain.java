package aNiuKeWang;

import java.util.Scanner;

public class Fain {
    static int fun(int n){
        if (n==1||n==0){
            return n;
        }
        else {
            return fun(n-1)+fun(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fun(n));
    }
}
