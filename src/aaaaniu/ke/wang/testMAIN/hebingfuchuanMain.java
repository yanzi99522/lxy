package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class hebingfuchuanMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String[] s3=new String[s1.length()+s2.length()];
        for (int i=0;i<s1.length();i++){
            for (int j=0;j<s2.length();j++){
                s3[i+j]=s1.substring(i,i+1)+s2.substring(s2.length()-1-i,s2.length()-i);
            }
        }
        int k=s1.length()+s2.length();
        for (int m=0;m<k/2;m++){
            System.out.print(s3[m]);
        }
    }
}
