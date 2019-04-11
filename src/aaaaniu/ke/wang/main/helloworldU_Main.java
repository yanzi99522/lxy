package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class helloworldU_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int n = str.length();
            int n1= (n + 2) / 3;
            int n2 = n+2 - 2 * n1;
            for (int i=0;i<n1-1;i++){
                System.out.print(str.charAt(i));
                for (int j=0;j<n2-2;j++){
                    System.out.print(" ");
                }
                System.out.print(str.charAt(n-1-i));
                System.out.println();
            }
            for (int j=0;j<n2;j++){
                System.out.print(str.charAt(n1-1+j));
            }
            System.out.println();

        }
    }

}