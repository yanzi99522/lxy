package aaaNiukewang;

import java.util.Scanner;

public class PingjunshuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
           double s=0;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();

            }
            for (int i = 0; i < arr.length; i++) {

                s += arr[i];

            }

            System.out.printf("%.2f",s/n);

        }
    }
}