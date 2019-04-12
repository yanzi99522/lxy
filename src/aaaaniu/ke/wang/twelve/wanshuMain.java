package aaaaniu.ke.wang.twelve;

import java.util.Scanner;

public class wanshuMain {
    static int wanshu(int n){
        int[] cun=new int[n];
        for (int i=1;i<n;i++){
            if (n%i==0){
                cun[i]=i;
            }
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+cun[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i=1;i<=n;i++){
               if (wanshu(i)==i){
                   System.out.print(i+" ");
               }
            }

        }
    }
}
