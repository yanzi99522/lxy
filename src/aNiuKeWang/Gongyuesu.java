package aNiuKeWang;

import java.util.Scanner;
//辗转相除法求最大公约数
public class Gongyuesu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(gcd(a, b));
        }
    }

    private static int gcd(int a,int b){
        int max,min,temp;
        if (a>b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        temp=max%min;
        while (temp!=0){
            max=min;
            min=temp;
            temp=max%min;
        }
        return min;
    }
}
//辗转相除法求最大公约数

