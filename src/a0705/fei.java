package a0705;

import java.util.Scanner;

/**
 * @author lxy
 */
public class fei {
    static int f(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=f(n);
        System.out.println(res);
    }
}
