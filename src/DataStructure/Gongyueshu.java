package DataStructure;

import java.util.Scanner;

public class Gongyueshu {
    static int gcd ( int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c=gcd(a,b);
        System.out.println("最大公约数是："+c);


        }
    }
