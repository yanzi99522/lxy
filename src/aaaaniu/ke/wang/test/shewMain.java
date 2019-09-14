package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class shewMain {
    static int skew(int n){
        int a=0;
        int k=0;
        int temp=0;
        int sum=0;
        int i=1;
        while (n!=0){

            a=n%10;

            temp=a*((int)Math.pow(2,i)-1);
            sum=sum+temp;
            i++;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int s=skew(n);
            System.out.println(s);
        }
    }
}
