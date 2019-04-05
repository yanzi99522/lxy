package aaaNiukewang;

import java.util.Scanner;

public class zuidaMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[10];

        while (in.hasNext()) {
            for (int j = 0; j < 10; j++) {
                number[j] = in.nextInt();

            }
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (number[i] < number[j]) {
                        int t = number[j];
                        number[j] = number[i];
                        number[i] = t;

                    }
                }
            }
            System.out.println("max="+number[0]);
        }

        //10个整数输出最大值

    }
}