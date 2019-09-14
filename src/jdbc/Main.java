package jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[7];
            int[] rr = new int[5];
            for (int i = 0; i < 6; i++) {

                arr[i] = in.nextInt();
//                System.out.print(arr[i]);
            }
//                if (in.next() == "\n") {
            for (int j = 0; j < 3; j++) {

                rr[j] = in.nextInt();
//                System.out.print(rr[j]);
            }
                int[] he = new int[4*n];
                for (int k = 0; k < n; k++) {
                            he[k] = arr[k];
                }
                for (int l = n; l < 2 * n; l++) {
                            he[l] = rr[l-n];
                }
                for (int k = 2*n; k < 3*n; k++) {
                            he[k] = arr[k-3];
                }

                for (int p=0;p<3*n;p++){
                    System.out.print(he[p]+",");
                }

                    }

                }
            }



