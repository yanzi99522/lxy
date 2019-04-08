package aaaaniu.ke.wang.test;

import java.util.Arrays;
import java.util.Scanner;

public class paixuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s=in.nextLine();
            char a[]=s.toCharArray();
            Arrays.sort(a);
            for (int i=0;i<a.length;i++){
                System.out.print(a[i]);
            }
        }
    }
}
