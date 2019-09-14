package aaaaniu.ke.wang.testMAIN;

import java.util.Scanner;

public class zifuchuanlianjieMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            String sc=in.next();

            System.out.print(str.replace(sc,""));
        }
    }
}
