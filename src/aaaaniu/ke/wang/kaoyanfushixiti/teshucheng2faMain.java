package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class teshucheng2faMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String a=in.next();
            String b=in.next();
            int sum=0;
            for (int i=0;i<a.length();i++){
                for (int j=0;j<b.length();j++){
                    int a1=a.charAt(i)-'0';
                    int b1=b.charAt(j)-'0';
                    sum=sum+a1*b1;
                }
            }
            System.out.println(sum);
        }
    }
}
