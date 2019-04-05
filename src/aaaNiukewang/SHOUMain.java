package aaaNiukewang;

import java.util.Scanner;

public class SHOUMain {
    static void shou(int n){
        int a=n*n;
        int b;
        if(a>100){
         b=a%100;
        }else {
            b=a%10;
        }
        if(n==b){
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            shou(n);
        }
    }
}
