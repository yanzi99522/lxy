package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class houzhuizichusanMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String[] s=new String[str.length()];
        for (int i=0;i<str.length();i++){

            s[i]=str.substring(i,str.length());
//            System.out.println(s[i]);
        }
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if (s[i].compareTo(s[j])>0){
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
            }
        }
        for (int i=0;i<str.length();i++){
            System.out.println(s[i]);
        }
    }


}
