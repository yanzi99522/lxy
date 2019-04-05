package aNiuKeWang;

import java.util.Scanner;

public class HEMain {
    static long he(long n){
        long a=n/10000;
        long b=(n%10000)/1000;
        long c=(n%1000)/100;
        long d=(n%100)/10;
        long e=n%10;
        return a+b+c+d+e;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextInt()){
            for (int i=0,j=0;i<10;i++,j++){
                long[] arr=new long[10];
                arr[i]=in.nextInt();
                long[] aar=new long[10];
                aar[j]=arr[i]*arr[i];
                System.out.printf(he(arr[i])+" "+he(aar[j]));
                System.out.println();

            }
        }
    }
}
