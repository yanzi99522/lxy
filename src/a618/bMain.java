package a618;

import java.util.Scanner;

/**
 * @author lxy
 */
public class bMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int n=1024-N;
            int a=n/64;
            int b=(n%64)/16;
            int c=(n%16)/4;
            int d=(n%4);
            System.out.println(a+b+c+d);
        }
    }
}
