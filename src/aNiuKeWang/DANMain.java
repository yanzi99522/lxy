package aNiuKeWang;

import java.util.Scanner;

public class DANMain {
    static int dan(int n){
        String str=n+"";
        char[] arr=str.toCharArray();
        int add=0;
        for (int i=0;i<arr.length;i++){
            add+=arr[i]-'0';
        }
        if (n<10){
            return n;
        }else {
            return dan(add);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextInt()){
            int n=in.nextInt();
            System.out.println(dan(n));
        }
    }
}
