package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class panduansanjiaoxingMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if (a*a==b*b+c*c||b*b+a*a==c*c||b*b==a*a+c*c){
            System.out.println("直角三角形");
        }else if (a*a>b*b+c*c||b*b+a*a<c*c||b*b>a*a+c*c){
            System.out.println("钝角三角形");
        }else {
            System.out.println("锐角三角形");
        }
    }
}
