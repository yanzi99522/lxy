package a0811;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] naozhong = new int[n][2];
        while (in.hasNext()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    naozhong[i][j] = in.nextInt();
                }
            }
            int lushang = in.nextInt();
            int[][] shangke = new int[1][2];
            for (int i = 0; i < 1; i++) {
                for (int j = 0;j < 2; j++) {
                    shangke[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                if (naozhong[i][0] > shangke[0][0]) {

                } else {
                    if (naozhong[i][0] == shangke[0][0] && (naozhong[i][1] + lushang) <= shangke[0][1]) {
                        System.out.print(naozhong[i][0] + " " + naozhong[i][1]);
                    } else {
                        if (naozhong[i][0] == (shangke[0][0] - 1) && (naozhong[i][1] + lushang) <= (shangke[0][1] + 60)) {
                            System.out.print(naozhong[i][0] + " " + naozhong[i][1]);
                        }
                    }
                }
            }
        }
    }
}
