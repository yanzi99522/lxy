package a630;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Mainc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0;
        int[] num=new int[100];
        while (in.hasNext()){
            int i=0;
            i++;
           num[i]=in.nextInt();
        }
        for (int i=0;i<99;i++){
           a= num[i]^num[i+1];

        }
        System.out.println(a);
    }
}
