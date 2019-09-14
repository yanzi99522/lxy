package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class DOUAHEBuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            String [] num=str.split(" ");
            String str2=in.next();
            String [] numm=str2.split(" ");
            long num1=Long.valueOf(num[0].toString().replaceAll(",",""));
            long num2=Long.valueOf(numm[0].toString().replaceAll(",",""));
            System.out.println(num1+num2);
        }
    }
}
