package www.ke;

import java.util.Scanner;

public class chengjipaixuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[][]score=new int[n][2];
            for (int i=0;i<n;i++){
                for (int j=0;j<2;j++){
                    score[i][j]=in.nextInt();
                }
            }
            int[][]score2=new int[n][2];
            for (int i=0;i<n;i++){
                for (int j=0;j<2;j++){
                    score2[i][j]=score[i][j];
                }
            }
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    int temp=0;
                    if (score[i][1]>score[j][1]){
                        temp=score2[i][1];
                        score2[i][1]=score2[j][1];
                        score2[j][1]=temp;
                    }
                }
            }
            for (int i=0;i<n;i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(score2[i][j]);
                }
                System.out.println();
            }
                for (int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    if (score[j][1] == score2[i][1]) {
                        System.out.print(j + " ");
                        System.out.println(score[i][i]);
                    }
                }
            }
        }
    }
}
