package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class oushujishukanMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int count = 0;
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                int count=0;
                while (n != 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                    } else {
                        n = 3 * n + 1;
                        n = n / 2;
                    }
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
