package aaaNiukewang;

import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String  s=in.nextLine();
        char[] chara=s.toCharArray();
        for (int i=chara.length-1;i>=0;i--){
            System.out.print(chara[i]);
        }
    }
}
