package a0715;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainSeqhe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String[] strings = in.nextLine().split(" ");
            int[] a = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                a[i] = Integer.valueOf(strings[i]);
            }

            int[] dp = new int[a.length];
            int res;
            if (a.length== 1) {
                dp[0]= a[0];

            } else {
                dp[0] = 0;
                res = dp[0];
                for (int i = 1; i < a.length; i++) {
                    dp[i] = (dp[i - 1] >= 0 ? dp[i - 1] + a[i] : a[i]);
                    res = Math.max(res, dp[i]);

                }
                System.out.println(res);
            }
        }
    }
}