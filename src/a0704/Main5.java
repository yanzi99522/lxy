package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main5 {
    static int Gongyueshu(int a,int b){//最大公约数
        int result=0;
        int t,g=0;
        if (a<b) {
            t = a;
            a = b;
            b = t;
        }
        g=a%b;
        while (g!=0){
            a=b;
            b=g;
            g=a%b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int re=(a*b)/(Gongyueshu(a,b));//最小公倍数
        System.out.println(re);
    }
}
