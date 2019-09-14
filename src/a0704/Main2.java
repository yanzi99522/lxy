package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main2 {
    static int tuzi(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return tuzi(n-1)+tuzi(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=tuzi(n);
        System.out.println(num);
    }
}
