package aaaaniu.ke.wang.test;

import java.util.Scanner;

public class zichuanMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            String[][] s=new String[str.length()][str.length()];
            for (int i=0;i<str.length();i++){
                for (int j=str.length();j>i;j--){

                     s[i][j-1]=str.substring(i,j);
                    System.out.println(s);
                }
            }
//            for (int i=0;i<str.length();i++){
//                for (int j=i;j<str.length();j++){
//                    s[i][j].equals(s[i+1][j+1]);
//                    System.out.println(s[i][j].equals(s[i+1][j+1]));
//                }
//            }
        }

    }
}
