package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class juzhenchengjiMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int[][]a=new int[2][3];
            int[][]b=new int[3][2];
            for (int i=0;i<2;i++){
                for (int j=0;j<3;j++){
                    a[i][j]=in.nextInt();
                }
            }
            for (int i=0;i<3;i++){
                for (int j=0;j<2;j++){
                    b[i][j]=in.nextInt();
                }
            }
            int[][]c=new int[2][2];
            c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];
            c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1]+a[0][2]*b[2][1];
            c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0]+a[1][2]*b[2][0];
            c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1]+a[1][2]*b[2][1];
            for (int i=0;i<2;i++){
                for (int j=0;j<2;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
