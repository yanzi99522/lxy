package aaaNiukewang;

import java.util.Scanner;

public class MicifangMain {
    static String mi(int n){
        String str="";
        while (n!=0){
            str=n%2+str;
            n=n/2;

        }
        return str;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";
        while (n!=0){
           str=n%2+str;

           n=n/2;

        }
        System.out.println(str);
    }
}
