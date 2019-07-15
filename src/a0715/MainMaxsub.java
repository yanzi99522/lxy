package a0715;

import java.util.Scanner;

/**有两个字符串（可能包含空格）,请找出其中最长的公共连续子串,输出其长度。
 * @author lxy
 */
public class MainMaxsub {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        char[]c1=s1.toCharArray();
        String s2=in.nextLine();
        char[]c2=s2.toCharArray();

        int res=0;
        int[][] dp=new int[s1.length()][s2.length()];
        for (int i=0;i<s1.length();i++){
            for (int j=0;j<s2.length();j++){
                if (c1[i]==c2[j]){
                    dp[i][j]=(i==0||j==0)?1:dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }
            }
        }
        System.out.println(res);




    }

}
