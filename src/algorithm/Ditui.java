package algorithm;

import java.util.Scanner;

public class Ditui {
    public static int fibonacci(int n){
        int t1,t2;
        if(n==1||n==2){
            return 1;
        }
        else {
            t1=fibonacci(n-1);
            t2=fibonacci(n-2);
            return t1+t2;
        }
    }

    public static void main(String[] args) {
        System.out.println("递推算法求解斐波那数列问题：");
        System.out.println("请先输入时间：");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int num=fibonacci(n);
        System.out.println("经过"+n+"月的时间，共能繁殖成"+num+"对兔子。");
    }
}
