package A0810;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[]shuzi=new long[n];
        while (in.hasNext()){
            for (int i=0;i<n;i++){
                shuzi[i]=in.nextLong();
            }
//           long[][]shuzu=new long[n][n];
//            shuzu[0]=shuzi;
//            for (int i=0;i<n;i++){
//               for (int j=0;i+j<n;j++){
//                   shuzu[i][j]=shuzi[i+j];
//                   System.out.print(shuzu[i][j] );
//               }
//                System.out.println();
//            }
            int []dp=new int[n];
            int result=-1;//记录dp中的最大值
            for (int i=0;i<n;i++){
                dp[i]=1;
                for (int j=0;j<j;j++){
                    if (shuzi[i]>shuzi[j]&&dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }
                result=Math.max(result,dp[i]);
            }
            System.out.println(result);


        }
    }
}
