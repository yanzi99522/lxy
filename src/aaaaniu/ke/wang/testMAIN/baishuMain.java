package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class baishuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        while (in.hasNext()) {
                n=in.nextInt();
            String[] hatcolor = new String[101];
            for (int i = 0; i < n; ++i) {
                int a=in.nextInt();
                String s=in.next();
                hatcolor[a] = s;
            }
            for (int i = hatcolor.length - 1; i > 0; --i) {
                if (hatcolor[i] != null) {
                    System.out.println(hatcolor[i]);
                }
            }
        }
    }
}
