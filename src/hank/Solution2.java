package hank;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a=A.length();
        int b=B.length();
        int c=a+b;
        System.out.println(c);
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.print(A);
        System.out.println(B);
    }
}