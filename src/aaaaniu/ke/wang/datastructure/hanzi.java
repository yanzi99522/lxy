package aaaaniu.ke.wang.datastructure;

import java.util.Scanner;

public class hanzi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for (int i=0;i<s.length();i++){
            int n=(int)s.charAt(i);
            System.out.print(n+" ");
            if (i%8==0){
                System.out.println();
            }
        }
    }
}
