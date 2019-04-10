package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class sushuMain {
    static int sushu(int n){
        int temp=0;
        if (n==1){
            temp=1;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                temp++;
            }else {

            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int t=sushu(n);
            if (t>0){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}
