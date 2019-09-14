package a0716;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainWanqusnhu {
    static int  yueshu(int n){
        int t=n/2;
        int sum=1;
        for (int i=2;i<=t;i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (sum==n){
            return 1;
        }else {
            return 0;
        }


    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            int count=0;
            for (int i=2;i<=num;i++){
                if (yueshu(i)==1){
                    count++;
                }
            }
        System.out.println(count);


    }
}
