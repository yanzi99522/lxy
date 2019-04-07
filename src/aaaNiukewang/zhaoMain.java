package aaaNiukewang;

import java.util.Scanner;

public class zhaoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] shu=new int[n];
        int np=-1;
        for (int i=0;i<n;i++){
            shu[i]=in.nextInt();
        }
        int cha=in.nextInt();
        int i=0;
        for (;i<n;i++){
            if (cha==shu[i]){
                System.out.println(i);
                break;
            }
        }
        if (i==shu.length){
            System.out.println(np);
        }
//        System.out.println(i);
    }
}
