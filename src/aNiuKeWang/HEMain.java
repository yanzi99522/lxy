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
    static long he2(long n){
        long a=n/1000000000;
        long a2=(n%1000000000)/100000000;
        long b=(n%100000000)/10000000;
        long c=(n%10000000)/1000000;
        long d=(n%1000000)/100000;
        long e=(n%100000)/10000;
        long f=(n%10000)/1000;
        long g=(n%1000)/100;
        long h=(n%100)/10;
        long i=n%10;
        return a+a2+b+c+d+e+f+g+h+i;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (in.hasNextInt()){
            for (int i=0,j=0;i<100;i++,j++){
                long[] arr=new long[100];
                arr[i]=in.nextInt();
                long[] aar=new long[100];
                aar[j]=arr[i]*arr[i];
                System.out.printf(he(arr[i])+" "+he2(aar[j]));
                System.out.println();

            }
        }
    }
}
