package aaaNiukewang;

import java.util.Scanner;

public class MicifangMain {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";
        int i=0;
        while (n!=0){
           str=n%2+str;

           n=n/2;
            System.out.print(i);
            i++;
        }
        System.out.println(str);
    }
}
