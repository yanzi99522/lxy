package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class diancaiwentiMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int c=in.nextInt();
            int n=in.nextInt();
            int[][] pingjia=new int[n+1][c+1];
            int[][]cai=new int[n+1][2];
            for (int i=0;i<n+1;i++){
                cai[i][0]=in.nextInt();
                cai[i][1]=in.nextInt();
            }
            for (int i=1;i<n+1;i++){
                for (int j=1;j<=c;j++){
                    if (j<cai[i][0]){
                        pingjia[i][j]=pingjia[i-1][j];

                    }else {
                        pingjia[i][j]=Math.max(cai[i][1]+pingjia[i-1][j-cai[i][0]],pingjia[i-1][j]);
                    }
                }
                System.out.println(pingjia[n][c]);
            }



        }
    }
}
