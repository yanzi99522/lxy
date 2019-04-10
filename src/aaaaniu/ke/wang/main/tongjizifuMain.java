package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class tongjizifuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            char[] s1=new char[s.length()];
            int[] ss=new int[s.length()];
            s1=s.toCharArray();
            String str=in.nextLine();
            for (int i=0;i<s.length();i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (s.substring(i,i+1).equals(str.substring(j,j+1))) {
                        ss[i]++;
                    }
                }
//                System.out.println(s1[i]+" "+ss[i]);
            }
            for (int k=0;k<s.length();k++){
                System.out.println(s1[k]+" "+ss[k]);
            }

        }
    }
}
