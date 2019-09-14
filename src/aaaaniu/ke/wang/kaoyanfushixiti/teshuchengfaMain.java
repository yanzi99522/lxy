package aaaaniu.ke.wang.kaoyanfushixiti;

import java.util.Scanner;

public class teshuchengfaMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        String str1="";
        String str2="";
        int n1=0;
        int n2=0;
        while (a!=0){
            n1=a%10;
            a=a/10;
            str1=n1+str1;
        }
        while (b!=0){
            n2=b%10;
            b=b/10;
            str2=n2+str2;
        }
        for (int i=0;i<str1.length();i++) {
            for (int j=0;j<str2.length();j++) {
                int a1=(int)str1.charAt(i);
                System.out.println(a1);
                int a2=(int)str2.charAt(j);
                System.out.println(a2);
                System.out.println(str1.substring(i, i + 1));
            }
        }
    }

}
