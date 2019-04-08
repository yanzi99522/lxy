package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class yueshuMain {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] rr=new int[n];
        int count=0;
        for (int i=0;i<n;i++){
            rr[i]=in.nextInt();
            for (int j=1;j<=rr[i];j++){
                if (rr[i]%j==0){
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
