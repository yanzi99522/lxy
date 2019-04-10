package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class duichenjuzhenMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
        int n=in.nextInt();
        int[][] juzhen=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                juzhen[i][j]=in.nextInt();
            }
        }
        int com=0;
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if (juzhen[i][j]!=juzhen[j][i]){
                    com++;
                }else {

                }
            }
        }
        if (com>0){
            System.out.println("NO!");
        }else {
            System.out.println("YES!");
        }
    }
}
}
