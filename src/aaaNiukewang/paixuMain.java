package aaaNiukewang;

import java.util.Arrays;
import java.util.Scanner;

public class paixuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int [] aa=new int[a];
        for (int i=0;i<a;i++){
            aa[i]=in.nextInt();
        }
        Arrays.sort(aa);
        System.out.println(aa[a-1]+" "+aa[0]);
    }
}
