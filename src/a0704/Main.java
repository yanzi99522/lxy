package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {//求1的个数
    static int qiu1(int n){
        int num=0;
        int temp=0;
        do{
            temp=n%2;
            n=n/2;
            if (temp==1){
                num++;
            }
        }while (n>0);
        return num;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=qiu1(n);
        System.out.println(num);
    }
}
