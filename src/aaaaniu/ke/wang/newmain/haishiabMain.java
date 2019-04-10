package aaaaniu.ke.wang.newmain;

import java.util.Scanner;

public class haishiabMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            int k=in.nextInt();
            int count=0;
            int sum=a+b;
            while (a%10==b%10){

                count++;
                a=a/10;
                b=b/10;
            }
            if (count==k){
                sum=-1;
            }
            System.out.println(sum);
        }

    }
}
