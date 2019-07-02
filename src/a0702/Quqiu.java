package a0702;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Quqiu {
    static void Quqiu(int a,int b,int c,int sum){
        int count=0;
        for (int i=0;i<=a;i++){
            for (int j=0;j<=b;j++){
                for (int k=0;k<=c;k++){
                    if (i+j+k==sum){
                        System.out.printf("取红球%2d个，取黄球%2d个，取绿球%2d个",i,j,k);
                        System.out.println();
                        count++;
                    }
                }
            }
        }
        System.out.printf("总的取球方法有%2d种",count);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        System.out.println("请输入红球、黄球、绿球的数量：");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("请输入要取的球总数量：");
        int sum=in.nextInt();
        Quqiu(a,b,c,sum);
    }
}
