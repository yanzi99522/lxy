package aNiuKeWang;

import java.util.Scanner;

public class qiaoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextInt()){
            for (int i=0;i<10;i++){
                int[] a=new int[10];
                a[i]=in.nextInt();
            }
        }
    }
}
