package a0705;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {//青蛙跳台阶
    static int f(int n){

        int num=0;
        if (n==1){
            return 1;
        } else {
          return 2*f(n-1);

        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
    int num=f(n);
        System.out.println(num);
    }
}
