package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class jioushuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] a = new int[n];
            int ou = 0;
            int ji = 0;
            for (int i = 0; i < n; i++) {
                a[i]=in.nextInt();
                if (a[i] % 2 == 0) {
                    ou++;
                } else {
                    ji++;
                }
            }
            if (ou > ji) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}