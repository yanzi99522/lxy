package a0716;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main3 {//放苹果问题
    static int fangpingguo(int m,int n){
        if (m==0||n==1){
            return 1;
        }else if (n>m){
            return fangpingguo(m,m);

        } else {
            return fangpingguo(m,n-1)+fangpingguo(m-n,n);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int num=fangpingguo(m,n);
        System.out.print(num);


    }
}
