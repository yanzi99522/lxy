package aaaaniu.ke.wang.eleven;

import java.util.Scanner;

public class singlenumberMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.nextLine();
            if (str.charAt(0)>'0'&&str.charAt(0)<'9'){
                for (int i=0;i<str.length();i++){
                    System.out.print(str.charAt(str.length()-1-i));
                }
            }else {
                String sub1=str.substring(1);
                System.out.print("-");
                for (int i=0;i<sub1.length();i++){
                    System.out.print(sub1.charAt(sub1.length()-1-i));
                }
            }
        }


    }
}
