package aNiuKeWang;

import java.util.Scanner;

public class San {
    static int min(int a,int b){
        int temp;
        if (a<b){
            return a;
        }else {
            return b;
        }
    }
    static int max(int a,int b){
        int temp;
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    static int mid(int a,int b,int c) {
        int x = min(min(a, b), c);
        int y = max(max(a, b), c);
        if (a!=x&&a!=y){
            return a;
        }else if (b!=x&&b!=y){
            return b;
        }else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int x=min(min(a,b),c);
        int y=max(max(a,b),c);
        int z=mid(a,b,c);
        System.out.println(x+z-y);
    }
}
