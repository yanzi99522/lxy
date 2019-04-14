package www.ke;

import java.util.Scanner;

public class juzhenhe {
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
            int sum1=0;
            int sum2=0;
            int sum3=0;
            int[] sum=new int[2*n+2];
            for (int i=0;i<n;i++){
                for (int j=0;j<i;j++){
                    sum1=juzhen[i][j]+sum1;
                }
                sum[i]=sum1;

            }

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    int temp=0;
                    sum[n+i]=temp +juzhen[i][0];
                }
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    int temp=0;
                    sum[2*n]=temp +juzhen[i][i];
                }
            }
            for (int i=0;i<2*n;i++){
                System.out.println(sum[i]);
            }
        }
    }
}
