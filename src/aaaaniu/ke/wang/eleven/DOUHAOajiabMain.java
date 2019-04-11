package aaaaniu.ke.wang.eleven;

import java.util.Scanner;

public class DOUHAOajiabMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=0,num2=0;
        while (in.hasNext()){
            String str1=in.nextLine();
            String s1=str1.replace(",","");
            String[] num=s1.split(" ");
            System.out.println(s1+99);
           long a=Long.valueOf(num[0].toString());
            System.out.println(a+99);
//            System.out.println(s1);
            if (s1.charAt(0)==45){
                num1=Integer.parseInt(s1)*(-1);
            }else {
                 num1=Integer.parseInt(s1);

            }
//            System.out.println(num1);
            String str2=in.nextLine();
            String s2=str2.replace(",","");
//            System.out.println(s2);
            if (s2.charAt(0)==45){
                num2=Integer.parseInt(s2)*(-1);
            }else {
                num2=Integer.parseInt(s2);

            }
//            System.out.println(num2);
            System.out.println(num1+num2);
//            char[]chars=s
        }


    }
}
