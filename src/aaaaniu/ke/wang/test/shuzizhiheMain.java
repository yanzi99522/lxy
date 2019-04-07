package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class shuzizhiheMain {
    static void test(int a){
        int sum1=0;
        int sum2=0;
        int temp=a;
        while (temp>0){
            sum1=sum1+temp%10;
            temp=temp/10;

        }
        System.out.println(sum1+" ");
        int b=a*a;
        while (b>0){
            sum2=sum2+b%10;
            b=b/10;
        }
        System.out.println(sum2);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            if (a==0){
                break;
            }
            test(a);
        }
    }
}
