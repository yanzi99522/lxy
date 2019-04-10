package aaaaniu.ke.wang.newmain;

import java.util.Scanner;
//最大上升子序列和
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] number=new int[n];
        int[] dp=new int[n];
        for (int i=0;i<n;i++){
            number[i]=in.nextInt();
            dp[i]=number[i];
        }

        for (int i=1;i<n;i++){
            for (int j=i-1;j>=0;j--){
                if (number[i]>number[j]){
                   dp[i]=Math.max(dp[i],number[i]+dp[j]);
                }
            }
            }
        int max=dp[0];
        for (int k=1; k<n;k++){
            max=Math.max(max,dp[k]);
        }
        System.out.println(max);
    }
}
