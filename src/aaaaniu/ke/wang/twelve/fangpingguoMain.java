package aaaaniu.ke.wang.twelve;

import java.util.Scanner;

public class fangpingguoMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int m=in.nextInt();
            int n=in.nextInt();
            int[]p=new int[m+1];
            int[]q=new int[n];
            int[][]pq=new int[m+1][n];
            for (int i=0;i<m+1;i++){
                for (int j=0;j<n;j++){
                    pq[i][j]=i;
                    System.out.print(pq[i][j]);
                }
                System.out.println();
            }
            int count=0;
            for (int i=0;i<=m;i++){

                    if (pq[i][0]+pq[i][1]+pq[i][2]==n){
                        count++;

                }
            }
            System.out.println(count);

        }
    }
}
