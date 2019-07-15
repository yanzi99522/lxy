package a0715;

import java.util.Scanner;

/**给定两个字符串，请编写代码，输出最长公共子串（Longest Common Substring），是指两个字符串中的最长的公共子串，要求子串一定是连续。
 输入描述:
 文本格式，2个非空字符串（字母数字组成），2个字符串以","英文逗号分割，字符串长度均小于等于100。
 * @author lxy
 */
public class MainGong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings = in.nextLine().split(",");
        String s1=strings[0];
        char[]c1=s1.toCharArray();
        String s2=strings[1];
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
