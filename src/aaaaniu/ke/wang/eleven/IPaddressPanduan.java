package aaaaniu.ke.wang.eleven;

import java.util.Scanner;

public class IPaddressPanduan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.nextLine();
            String[] s=str.split("\\.");
            int len=s.length;
            int[] n=new int[len];
            int flag=0;
            for (int i=0;i<len;i++){
                n[i]=Integer.valueOf(s[i].toString());
                if (n[i]<0||n[i]>255){
                    flag++;
                }
            }
            if (flag>0){
                System.out.println("No!");
            }else {
                System.out.println("Yes!");
            }
        }

    }
}
