package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class zuijianzhenfenshuMain {
    static int gongyinshu(int a,int b){
        int flag=0;
        for (int i=2;i<=a;i++){
            if (a%i==0&&b%i==0){
              flag++;
            }else {

            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[] number=new int[n];
        for (int i=0;i<n;i++){
            number[i]=in.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<j){
                   int f= gongyinshu(number[i],number[j]);
                   if (f==0){
                       count++;
                   }
                }
            }
        }
        System.out.println(count);
    }
}
