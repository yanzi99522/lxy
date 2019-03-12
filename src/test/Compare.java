package test;

import java.util.Scanner;

public class Compare {


    public static void main(String[] args) {
        int a, b, c;
        System.out.println("请输入a,b,c");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

            int t;
            if (a < b) {
                t = a;
                a = b;
                b = t;
            }
            if (a < c) {
                t = a;
                a = c;
                c = t;
            }
            if (b < c) {
                t = b;
                b = c;
                c = t;
            }
            System.out.println("a,b,c从大到小的顺序是" + a + b + c);
        }
    }



