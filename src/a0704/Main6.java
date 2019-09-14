package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main6 {//百钱买百鸡问题
    static void bai(int n){
        for (int i=0;i<=100;i++){
            for (int j=0;j<=100;j++){
                int k=100-i-j;
                if ((5*i+3*j+k/3==100)&&(k%3==0)){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        bai(n);
    }
}
