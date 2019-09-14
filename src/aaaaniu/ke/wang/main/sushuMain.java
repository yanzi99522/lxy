package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class sushuMain {
    static int sushu(int n){
        int temp=0;
        int count=0;
        if (n==1){
            temp=1;
        }
        if (n==2||n==3){
            count=n-1;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                temp++;

            }else {
                int k=0;
                int[] sushu=new int[1000];
                if (temp==0){
                    sushu[k]=n;
                    System.out.println(n);
                    System.out.println(sushu[k]+" 是素数");

                    k++;
                    count++;

            }

            }

        }
       return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int t=sushu(n);
            System.out.println(t);
        }
    }
}
