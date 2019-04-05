package aaaNiukewang;

import java.util.Scanner;

public class jiechengMain {
    static long fun(long n){
        if (n==1||  n==0){
            return 1;
        }
        else if (n==2){
            return 2;
        }
        else {
            return fun(n-1)*n;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextInt();
        System.out.println(fun(n));
    }
}
